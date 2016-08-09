package edu.nc.sumy.model;

import org.testng.annotations.Test;


public class SomeModelClassTest {

    @Test(  expectedExceptions              = NullPointerException.class,
            expectedExceptionsMessageRegExp = ".*Are you kidding me?.*")
    public void gotExceptionDueToNullMessagePattern(){
        new SomeModelClass().makeMeHappy(null);
    }
}