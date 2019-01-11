package com.telerikacademy.furnituremanufacturer.models.furnitures;

import com.telerikacademy.furnituremanufacturer.interfaces.Chair;
import com.telerikacademy.furnituremanufacturer.models.MaterialType;

public class ChairImpl extends FurnitureBase implements Chair {

    private static final String LEGS_ERR = "Wrong number of legs!";
    private int numberOfLegs;

    public ChairImpl(String model, MaterialType materialType, double price, double height, int numberOfLegs) {
        super(model, materialType, price, height);
        this.setNumberOfLegs(numberOfLegs);
    }

    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    private void setNumberOfLegs(int numberOfLegs) {
        this.validateLegs(numberOfLegs);
        this.numberOfLegs = numberOfLegs;
    }

    private void validateLegs(int numberOfLegs) {
        if (numberOfLegs < 0){
            throw new IllegalArgumentException(LEGS_ERR);
        }
    }

    protected String additionalInfo(){

        return ", Legs: " + this.numberOfLegs;
    }
}
