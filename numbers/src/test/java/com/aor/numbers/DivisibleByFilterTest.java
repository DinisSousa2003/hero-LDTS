package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleByFilterTest {
    @Test
    public void divisible2(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Boolean> expected = Arrays.asList(false, true, false, true, false, true);

        List<Boolean> divisible = new ArrayList<>();
        DivisibleByFilter divisor = new DivisibleByFilter(2);

        for(Integer i : list){
            divisible.add(divisor.accept(i));
        }

        Assertions.assertEquals(expected, divisible);
    }

    @Test
    public void divisible3(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Boolean> expected = Arrays.asList(false, false, true, false, false, true);

        List<Boolean> divisible = new ArrayList<>();
        DivisibleByFilter divisor = new DivisibleByFilter(3);

        for(Integer i : list){
            divisible.add(divisor.accept(i));
        }

        Assertions.assertEquals(expected, divisible);
    }
}
