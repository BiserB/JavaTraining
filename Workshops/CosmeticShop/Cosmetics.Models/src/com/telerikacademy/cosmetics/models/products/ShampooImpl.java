package com.telerikacademy.cosmetics.models.products;

import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.common.UsageType;
import com.telerikacademy.cosmetics.models.contracts.Shampoo;

public class ShampooImpl extends ProductBase implements Shampoo {

    private int milliliters;
    private UsageType usage;

    public ShampooImpl(String name, String brand, double price, GenderType gender, int milliliters, UsageType usage) {
        super(name, brand, price, gender);
        this.setMilliliters(milliliters);
        this.setUsage(usage);
    }

    public  UsageType getUsage(){
        return this.usage;
    }

    private void setUsage(UsageType usage) {
        this.validateObject(usage);
        this.usage = usage;
    }

    public int getMilliliters(){
        return this.milliliters;
    }

    private void setMilliliters(int milliliters) {
        this.validatePositiveInt(milliliters);
        this.milliliters = milliliters;
    }

    public String print(){
        String result = super.print();

        result += " #Milliliters: " + this.milliliters + System.getProperty("line.separator") +
                  " #Usage: " + this.usage.toString() + System.lineSeparator() + " ===";

        return result;
    }

}
