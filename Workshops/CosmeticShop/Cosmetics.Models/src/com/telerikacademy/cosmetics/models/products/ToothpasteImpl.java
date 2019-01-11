package com.telerikacademy.cosmetics.models.products;

import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.contracts.Toothpaste;

public class ToothpasteImpl extends ProductBase implements Toothpaste {

    private String ingredients;

    public ToothpasteImpl(String name, String brand, double price, GenderType gender, String ingredients)
    {
        super(name, brand, price, gender);
        this.setIngredients(ingredients);
    }

    public String getIngredients() {
        return this.ingredients;
    }

    private void setIngredients(String ingredients) {
        this.validateObject(ingredients);
        this.ingredients = ingredients;
    }

    public String print(){
        String result = super.print();

        result += " #Ingredients: " + this.ingredients + "\n ===";

        return result;
    }
}
