package com.pluralsight.finance;

import java.math.BigDecimal;

public class Jewelry extends FixedAsset {
    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
    }

    //Add overridden getValue method
    //Add BigDecimal instead of double
    @Override
    //public double getValue()
    public BigDecimal getValue() {
        return BigDecimal.valueOf(0);
    }
}
