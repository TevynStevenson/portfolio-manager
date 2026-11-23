package com.pluralsight.finance;

public class Jewelry extends FixedAsset{
    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
    }

    //Add overridden getValue method
    @Override
    public double getValue(){
        return 0;
    }
}
