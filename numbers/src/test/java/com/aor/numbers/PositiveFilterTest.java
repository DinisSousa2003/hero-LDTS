package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositiveFilterTest {
    @Test
    public void positive(){
        List<Integer> list = Arrays.asList(1, -2, 3, -4, 0, 6);
        List<Boolean> expected = Arrays.asList(true, false, true, false, false, true);

        List<Boolean> positive = new ArrayList<>();
        PositiveFilter positiveF = new PositiveFilter();

        for(Integer i : list){
            positive.add(positiveF.accept(i));
        }

        Assertions.assertEquals(expected, positive);
    }
}
