package com.lenura.project.model;

public class Conversion {

    private double valueToConvert;
    private double convertedValue;
    private Coins currencyToConvertFrom;
    private Coins currencyToConvertTo;

    @Override
    public String toString() {
        return "" + this.getValueToConvert() + this.getCurrencyToConvertFrom() + "=" + this.getConvertedValue() + this.getCurrencyToConvertTo() + "\n";
    }

    public Coins getCurrencyToConvertFrom() {
        return currencyToConvertFrom;
    }

    public void setCurrencyToConvertFrom(Coins currencyToConvertFrom) {
        this.currencyToConvertFrom = currencyToConvertFrom;
    }

    public double getValueToConvert() {
        return valueToConvert;
    }

    public void setValueToConvert(double valueToConvert) {
        this.valueToConvert = valueToConvert;
    }

    public double getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(double convertedValue) {
        this.convertedValue = convertedValue;
    }

    public Coins getCurrencyToConvertTo() {
        return currencyToConvertTo;
    }

    public void setCurrencyToConvertTo(Coins currencyToConvertTo) {
        this.currencyToConvertTo = currencyToConvertTo;
    }
}
