package com.sarac;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;


public class Abc {
    @Getter
    private Integer number;
    private LinkedHashMap<BigDecimal,Boolean>linkedHashMap;
    protected static String id;



    public LinkedHashMap<BigDecimal, Boolean> getLinkedHashMap() {
        return linkedHashMap;
    }

    private void setNumber(Integer number) {
        if (number<-18){
            throw new RuntimeException();
        }else{
            this.number = number;
        }

    }

    public Abc(Integer number) {
        setNumber(number);
    }
}
