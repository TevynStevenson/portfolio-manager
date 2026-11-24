package com.pluralsight.finance;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Portfolio {

    //Make list for all Valuable items
    private List<Valuable> valuables = new ArrayList<Valuable>();

    public void addToPortfolio(Valuable valuable) {
        valuables.add(valuable);
    }

    public BigDecimal getPortfolioValue(Valuable valuable) {

        //Add value variable
        BigDecimal value = new BigDecimal(0);

        //Add for loop to sort through the portfolio
        for (Valuable v : valuables) {
            value = value.add(v.getValue());
        }

        //Return the portfolio value
        return value;
    }

    public BigDecimal getValue() {
        //Add bigdecimal starting at 0
        BigDecimal netValue = BigDecimal.ZERO;

        //Add if statement for if the list is empty
        if (valuables.isEmpty()) {
            return null;
        }
        //Add for loop to sort through the valuables to get total value
        for (Valuable v : valuables) {
            netValue = netValue.add(v.getValue());
        }

        //Return netValue
        return netValue;
    }

    public Valuable getMostValuableItem(Valuable valuable) {
        //Add valuables to the list
        Valuable mostValuable = valuables.get(0);

        //Add if statement for if the list is empty
        if (valuables.isEmpty()) {
            return null;
        }

        //Add for loop to sort through the items
        for (Valuable v : valuables) {
            if (valuable.getValue().compareTo(mostValuable.getValue()) > 0) {
                mostValuable = valuable;
            }
        }
        //Return the mostValuable item
        return mostValuable;
    }

    public Valuable getLeastValuableItem(Valuable valuable) {

        //Add valuables to the list
        Valuable leastValuable = valuables.get(0);

        //Add for loop to sort through the variables
        for (Valuable v : valuables) {
            if (valuable.getValue().compareTo(leastValuable.getValue()) < 0) {
                leastValuable = valuable;
            }
        }
        //Return the leastValuable item
        return leastValuable;
    }
}
