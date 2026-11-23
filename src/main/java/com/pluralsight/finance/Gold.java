package com.pluralsight.finance;

public class Gold extends FixedAsset{
    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
    }

    //Add overridden getValue()
    @Override
    public double getValue(){
        return 0;
    }
}
