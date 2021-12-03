package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {
    @Test
    public void list_filterer() {
        List<Integer> list = Arrays.asList(1,2,3,4,10,-4);


        GenericListFilterer filter_stub = Mockito.mock(GenericListFilterer.class);
        Mockito.when(filter_stub.accept(Mockito.anyInt())).thenReturn(true);

        ListFilterer listFilterer = new ListFilterer(filter_stub);
        List<Integer> filtered = listFilterer.filter(list);

        Assertions.assertEquals(filtered, list);
    }
}
