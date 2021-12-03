package com.aor.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFilterer {
    private GenericListFilterer filterer;

    public ListFilterer(GenericListFilterer filter){
        this.filterer = filter;
    }

    public List<Integer> filter(List<Integer> list){
        List<Integer> acceptedList = new ArrayList<>();
        for(Integer i : list){
            if(filterer.accept(i)){
                acceptedList.add(i);
            }
        }
        return acceptedList;
    }
}
