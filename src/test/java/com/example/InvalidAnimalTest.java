package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class InvalidAnimalTest {
    private final String ANIMAL_KIND;

    public InvalidAnimalTest(String animalKind) {
        this.ANIMAL_KIND = animalKind;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0}")
    public static Object[] invalidFelineAnimalKind() {
        return new Object[]{
                null,
                "Predator",
                "Всеядное",
                "Undefined"
        };
    }

    @Test(expected = Exception.class)
    public void getInvalidAnimalFoodTest() {
        Feline feline = new Feline();
        feline.getFood(ANIMAL_KIND);
    }
}
