package com.pluralsight.finance;

import java.math.BigDecimal;

public abstract class FixedAsset {

    private String name;
    private double marketValue;

    //Add constructor
    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    //Add getters and setters
    //Getter/setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Getter/setter for MarketValue
    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }


    //Added BigDecimal instead of double
    //public double getValue()
    public BigDecimal getValue() {
        return BigDecimal.valueOf(0);
    }

    @Override
    public String toString() {
        return "Asset Name : " +
                " " + name + '\'' +
                ", Market Value: " + "$" + marketValue ;
    }
}
