package com.sarac;

import java.util.HashSet;
import java.util.Set;

public class Mahir extends Xyz {


    @Override
    public Set<Character> method2(char[] arr) {

        Set<Character> characterSet = new HashSet<>();
        for (char c : arr) {
            characterSet.add(c);
        }
        return characterSet;
    }
}
