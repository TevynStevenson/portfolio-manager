package com.pluralsight.finance;

public class Jewelry extends FixedAsset{
    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
    }

    //Add overridden getValue statement
    @Override
    public double getValue(){
        return 0;
    }
}
