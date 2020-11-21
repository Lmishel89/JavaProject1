package com.lenura.project.model;

import com.lenura.project.ICalculate;

public abstract class Coin implements ICalculate {
    public abstract double getValue ();

    @Override
    public double calculate(double amount) {

        return amount;
    }
}
