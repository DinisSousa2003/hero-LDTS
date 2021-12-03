package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilterer{
    private Integer divisor;

    public DivisibleByFilter(Integer divisor){
        this.divisor = divisor;
    }

    @Override
    public Boolean accept(Integer number) {
        return (number % divisor == 0);
    }
}
