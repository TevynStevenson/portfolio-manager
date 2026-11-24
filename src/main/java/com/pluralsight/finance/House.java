package com.pluralsight.finance;

import java.math.BigDecimal;

public class House extends FixedAsset {
    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
    }

    //Add overridden get value method
    //Add BigDecimal instead of double
    @Override
    //public double getValue()
    public BigDecimal getValue() {
        return BigDecimal.valueOf(0);
    }


}
