package com.telerikacademy.cosmetics.models.products;

import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.common.Scent;
import com.telerikacademy.cosmetics.models.contracts.Cream;
import com.telerikacademy.cosmetics.models.contracts.Product;
import com.telerikacademy.cosmetics.models.contracts.Shampoo;

public class CreamImpl extends ProductBase implements Cream {

    private static final int NAME_MAX_LENGTH = 15;
    private static final int BRAND_MAX_LENGTH = 15;
    private Scent scent;

    public CreamImpl(String name, String brand, double price, GenderType gender, Scent scent) {
        super(name, brand, price, gender);
        this.setScent(scent);
        this.setNameMaxLength(NAME_MAX_LENGTH);
        this.setBrandMaxLength(BRAND_MAX_LENGTH);
    }

    private void setScent(Scent scent) {
        this.validateObject(scent);
        this.scent = scent;
    }

    public Scent getScent(){
        return this.scent;
    }
}
