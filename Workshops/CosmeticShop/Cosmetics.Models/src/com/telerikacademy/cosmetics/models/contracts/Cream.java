package com.telerikacademy.cosmetics.models.contracts;

import com.telerikacademy.cosmetics.models.common.Scent;

public interface Cream extends Product{

    public Scent getScent();

    String print();
}
