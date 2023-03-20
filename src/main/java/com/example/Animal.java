package com.example;

import java.util.List;

public class Animal {

    private static final String FAMILY_MESSAGE = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

    public List<String> getFood(String animalKind) throws IndexOutOfBoundsException {
        if ("Травоядное".equals(animalKind)) {
            return List.of("Трава", "Различные растения");
        } else if ("Хищник".equals(animalKind)) {
            return List.of("Животные", "Птицы", "Рыба");
        } else {
            throw new IndexOutOfBoundsException("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }

    public String getFamily() {
        return FAMILY_MESSAGE;
    }
}