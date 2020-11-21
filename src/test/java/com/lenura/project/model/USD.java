package com.lenura.project.model;

public class USD extends Coin {
    final private double value = 3.52;
    @Override
    public double getValue() {
        return value;
    }
    @Override
    public double calculate(double amount) {

        //return super.calculate(arg);
        return amount * getValue();
    }

}
