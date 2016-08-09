package edu.nc.sumy.view;

import org.testng.annotations.Test;
import org.testng.collections.CollectionUtils;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;


public class SomeViewClassTest {

    @Test
    public void mockSomeAction(){
        Integer three = 3;
        List<Integer> values = asList(1,2,three);

        // Mock Action interface
        Action maxAction = mock(Action.class);
        when(maxAction.justDoItOn(values))
                .thenReturn(values.stream().max(Integer::compareTo).get());

        // Start testing
        SomeViewClass view = new SomeViewClass(values);

        assertEquals(three, view.execute(maxAction));
    }
}