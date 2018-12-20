package com.telerikacademy.furnituremanufacturer.models.furnitures;

import com.telerikacademy.furnituremanufacturer.interfaces.Table;
import com.telerikacademy.furnituremanufacturer.models.MaterialType;

public class TableImpl extends FurnitureBase implements Table {

    private double width;
    private double length;

    public TableImpl(String model, MaterialType materialType, double price, double height, double length, double width) {
        super(model, materialType, price, height);
        this.setLength(length);
        this.setWidth(width);
    }

    private void setWidth(double width) {
        this.width = width;
    }

    private void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getLength() {
        return this.length;
    }

    @Override
    public double getWidth() {
        return this.width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    protected String additionalInfo(){

        return String.format(", Length: %.2f, Width: %.2f, Area: %.4f",
                            this.length, this.width, this.getArea());
    }

}
