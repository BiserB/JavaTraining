package com.telerikacademy.furnituremanufacturer.models.furnitures;

import com.telerikacademy.furnituremanufacturer.interfaces.Furniture;
import com.telerikacademy.furnituremanufacturer.models.MaterialType;

public abstract class FurnitureBase implements Furniture {

    private static final int MODEL_MIN_LENGTH = 3;
    private static final String MODEL_NULL_ERR_MSG = "Model should not be null";
    private static final String MODEL_LENGTH_ERR_MSG = "Model should be at least %s characters";
    private static final String HEIGHT_ERR_MSG = "Height should not be less than zero";
    private static final String PRICE_ERR_MSG = "Price should not be less than zero";
    private static final String MATERIAL_ERR_MSG = "Material Type should not be null";
    private static final String CLASS_ENDING = "Impl";
    private static final String INFO = "Type: %s, Model: %s, Material: %s, Price: %.2f, Height: %.2f%s";

    private String model;
    private MaterialType materialType;
    private double price;
    private double height;

    public FurnitureBase(String model, MaterialType materialType, double price, double height)
    {
        setModel(model);
        setMaterialType(materialType);
        setPrice(price);
        setHeight(height);
    }

    protected void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException(HEIGHT_ERR_MSG);
        }
        this.height = height;
    }

    private void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException(PRICE_ERR_MSG);
        }
        this.price = price;
    }

    private void setMaterialType(MaterialType materialType) {
        if (materialType == null) {
            throw new IllegalArgumentException(MATERIAL_ERR_MSG);
        }
        this.materialType = materialType;
    }

    private void setModel(String model) {
        if (model == null) {
            throw new IllegalArgumentException(MODEL_NULL_ERR_MSG);
        }
        if (model.length() < MODEL_MIN_LENGTH) {
            throw new IllegalArgumentException(String.format(MODEL_LENGTH_ERR_MSG, MODEL_MIN_LENGTH));
        }
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

    public MaterialType getMaterialType(){
        return this.materialType;
    }

    public double getPrice(){
        return this.price;
    }

    public double getHeight() {
        return this.height;
    }

    protected String additionalInfo()
    {
        return "";
    }

    @Override
    public String toString()
    {
        String name = this.getClass().getSimpleName().replace(CLASS_ENDING, "");

        return String.format(INFO, name, model, materialType, price, height, additionalInfo() );
    }
}
