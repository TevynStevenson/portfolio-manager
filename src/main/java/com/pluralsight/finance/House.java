package com.pluralsight.finance;

public class House extends FixedAsset{
    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
    }

    @Override
    public double getValue(){
        return 0;
    }
}
