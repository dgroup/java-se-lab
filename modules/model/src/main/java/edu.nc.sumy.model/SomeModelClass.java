package edu.nc.sumy.model;

import org.apache.commons.lang3.Validate;

import java.text.MessageFormat;

import static org.apache.commons.lang3.Validate.notEmpty;


public class SomeModelClass {

    public String makeMeHappy(String format, Object ...args){
        notEmpty(format, "Are you kidding me? How can i do formatting for empty value?");
        return MessageFormat.format(format, args);
    }
}