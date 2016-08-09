package edu.nc.sumy.controller;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class SomeControllerClass {

    public Set<BigInteger> toSetOfBigIntegerAndIgnoreCorruptedValues(String... values) {
        Set<BigInteger> set = new HashSet<>();
        for (String value : values) {
            try {
                if (value != null)
                    set.add(new BigInteger(value));
            } catch (NumberFormatException e) {
                // ok, value isn't BigInteger, skip it
            }
        }
        return set;
    }

}