package com.telerikacademy.cosmetics.core.engine;

import com.telerikacademy.cosmetics.core.contracts.CosmeticsFactory;
import com.telerikacademy.cosmetics.models.CategoryImpl;
import com.telerikacademy.cosmetics.models.cart.ShoppingCartImpl;
import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.common.Scent;
import com.telerikacademy.cosmetics.models.common.UsageType;
import com.telerikacademy.cosmetics.models.contracts.*;
import com.telerikacademy.cosmetics.models.products.CreamImpl;
import com.telerikacademy.cosmetics.models.products.ShampooImpl;
import com.telerikacademy.cosmetics.models.products.ToothpasteImpl;

import java.util.List;

public class CosmeticsFactoryImpl implements CosmeticsFactory {
    @Override
    public Category createCategory(String name) {
        return new CategoryImpl(name);
    }

    @Override
    public ShampooImpl createShampoo(String name, String brand, double price, GenderType gender, int milliliters, UsageType usage) {
        return new ShampooImpl(name, brand, price, gender, milliliters, usage);
    }

    @Override
    public ToothpasteImpl createToothpaste(String name, String brand, double price, GenderType gender, List<String> ingredients) {

        String ingr = String.join(", ", ingredients);

        return new ToothpasteImpl(name, brand, price, gender, ingr);
    }

    public CreamImpl createCream(String name, String brand, double price, GenderType gender, Scent scent) {

        return new CreamImpl(name, brand, price, gender, scent);
    }

    @Override
    public ShoppingCartImpl createShoppingCart() {
        return new ShoppingCartImpl();
    }
}
