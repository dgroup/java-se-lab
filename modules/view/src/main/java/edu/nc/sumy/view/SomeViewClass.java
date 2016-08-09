package edu.nc.sumy.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.apache.commons.lang3.Validate.notNull;

public class SomeViewClass {

    private final Logger log = LoggerFactory.getLogger(SomeViewClass.class);
    private final List<Integer> values;

    public SomeViewClass(List<Integer> values){
        this.values = values;
    }

    public Integer execute(Action action){
        notNull(action, "Dude, my mother doesn't allows me to work with a null value!");
        try {
            return action.justDoItOn(values);
        } catch (ShitHappensException e){
            log.warn(" ¯\\_(ツ)_/¯", e);
            return 500;
        }
    }

}