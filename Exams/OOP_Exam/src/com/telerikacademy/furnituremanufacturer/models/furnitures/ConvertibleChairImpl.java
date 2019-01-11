package com.telerikacademy.furnituremanufacturer.models.furnitures;

import com.telerikacademy.furnituremanufacturer.interfaces.ConvertibleChair;
import com.telerikacademy.furnituremanufacturer.interfaces.Furniture;
import com.telerikacademy.furnituremanufacturer.models.MaterialType;

public class ConvertibleChairImpl extends ChairImpl implements ConvertibleChair {

    private static final double CONVERTED_HEIGHT = 0.10;
    private static final String normal = "Normal";
    private static final String converted = "Converted";
    private static final String state = ", State: ";

    private boolean isConverted;
    private double initialHeight;

    public ConvertibleChairImpl(String model, MaterialType materialType, double price, double height, int numberOfLegs) {
        super(model, materialType, price, height, numberOfLegs);
        this.isConverted = false;
        this.initialHeight = height;
    }

    @Override
    public boolean getIsConverted() {
        return this.isConverted;
    }

    @Override
    public void convert() {
        if (isConverted){
            this.setHeight(initialHeight);
        }
        else {
            this.setHeight(CONVERTED_HEIGHT);
        }
    }

    protected String additionalInfo(){

        String currState = isConverted ? converted : normal;
        return  state + currState;
    }
}
