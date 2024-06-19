package com.techelevator;

public class NumbericFns<T extends Number> {
    T num;

    public NumbericFns(T ob) {
        this.num = ob;
    }

    boolean absEqual(NumbericFns<?> ob) {
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;
        return false;
    }
//    double square() {
//        return ob.intValue() * ob.doubleValue();
//    }
}
