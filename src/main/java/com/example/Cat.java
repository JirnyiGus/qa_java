package com.example;

import java.util.List;

public class Cat extends Animal {

    private Predator predator;

    public Cat(Feline feline) {
        this.predator = feline;
    }

    public String getSound() {
        return "Мяу";
    }

    public List<String> getFood() {
        return predator.eatMeat();
    }
}