package com.aor.numbers;

public class PositiveFilter implements GenericListFilterer{

    @Override
    public Boolean accept(Integer number) {
        return number > 0;
    }
}
