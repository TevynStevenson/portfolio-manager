package com.pluralsight.finance;

import java.math.BigDecimal;

public interface Valuable {

    //Add get value method to be overridden by other classes
    //Adding BigDecimal instead of double
    // double getValue();
    BigDecimal getValue();
}
