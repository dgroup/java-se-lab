package edu.nc.sumy.controller;

import org.testng.annotations.Test;

import java.math.BigInteger;
import java.util.Set;

import static java.math.BigInteger.ONE;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;

public class SomeControllerClassTest {

    @Test
    public void arrayOfStringToSetOfBigIntegers() {
        Set<BigInteger> set = new SomeControllerClass()
                .toSetOfBigIntegerAndIgnoreCorruptedValues("1", "2.2", "asdjfa;sdf", null, "21312312938440");
        assertThat(set, hasSize(2));
        assertThat(set, hasItems(ONE, new BigInteger("21312312938440")));
    }
}