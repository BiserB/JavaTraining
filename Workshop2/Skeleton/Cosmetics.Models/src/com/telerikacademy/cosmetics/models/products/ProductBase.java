package com.telerikacademy.cosmetics.models.products;

import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.contracts.Product;

public abstract class ProductBase implements Product {

    private int nameMinLength = 3;
    private int brandMinLength = 2;

    private int nameMaxLength = 10;
    private int brandMaxLength = 10;



    private String name;
    private String brand;
    private double price;
    private GenderType gender;

    protected ProductBase(String name, String brand, double price, GenderType gender) {
        this.setName(name);
        this.setBrand(brand);
        this.setPrice(price);
        this.setGender(gender);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.validateString(name);
        this.checkNameLength(name);
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }

    private void setBrand(String brand) {
        this.validateString(brand);
        this.checkBrandLength(brand);
        this.brand = brand;
    }

    public double getPrice() {
        return this.price;
    }

    private void setPrice(double price) {
        validatePositiveInt(price);
        this.price = price;
    }

    public GenderType getGender() {
        return this.gender;
    }

    private void setGender(GenderType gender) {
        validateObject(gender);
        this.gender = gender;
    }

    protected void setNameMinLength(int length){
        validatePositiveInt(length);
        this.nameMinLength = length;
    }

    protected void setNameMaxLength(int length){
        validatePositiveInt(length);
        this.nameMaxLength = length;
    }

    protected void setBrandMinLength(int length){
        validatePositiveInt(length);
        this.brandMinLength = length;
    }

    protected void setBrandMaxLength(int length){
        validatePositiveInt(length);
        this.brandMaxLength = length;
    }

    public String print() {

        String result = String.format("#%s %s\n" ,this.name, this.brand);
        result += " #Price: $" + this.price + "\n";
        result += " #Gender: " + this.gender.toString() + "\n";
        return result;
    }

    protected void validateObject(Object object) {
        if(object == null){
            throw new IllegalArgumentException();
        }
    }

    protected void validatePositiveInt(double num) {
        if(num < 0){
            throw new IllegalArgumentException();
        }
    }

    protected void validateString(String str) {
        if(str == null || str.isEmpty()){
            throw new IllegalArgumentException();
        }
    }

    protected void checkNameLength(String str) {
        if(str.length() < nameMinLength || str.length() > nameMaxLength){
            throw new IllegalArgumentException(
                    String.format("Name length must be between %d and %d symbols.", nameMinLength, nameMaxLength));
        }
    }

    protected void checkBrandLength(String str) {
        if(str.length() < brandMinLength || str.length() > brandMaxLength){
            throw new IllegalArgumentException(
                    String.format("Name length must be between %d and %d symbols.", brandMinLength, brandMaxLength));
        }
    }
}
