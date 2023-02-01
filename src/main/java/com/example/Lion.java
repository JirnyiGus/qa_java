package com.example;

import java.util.List;

public class Lion {

    boolean male;
    Feline feline;


    public Lion(String sex, Feline feline) throws IndexOutOfBoundsException {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            male = true;
        } else if ("Самка".equals(sex)) {
            male = false;
        } else {
            throw new IndexOutOfBoundsException("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return male;
    }

    public List<String> getFood() {
        return feline.getFood("Хищник");
    }
}
