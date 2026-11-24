package com.pluralsight.finance;

import java.math.BigDecimal;

public class Gold extends FixedAsset {
    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
    }

    //Add overridden getValue() method
    //Add BigDecimal instead of double
    @Override
    //public double getValue()
    public BigDecimal getValue() {
        return BigDecimal.valueOf(0);
    }
}
