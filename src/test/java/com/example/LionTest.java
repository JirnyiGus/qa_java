package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getLionFoodTest() {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = lion.getFood();
        assertEquals("Некорректный результат вызова метода", expectedResult, actualResult);
    }

    @Test
    public void getLionKittenTest() {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedResult = 1;
        int actualResult = lion.getKittens();
        assertEquals("Некорректный результат вызова метода", expectedResult, actualResult);
    }

    @Test
    public void lionCheckManeTest() {
        Lion lion = new Lion("Самец", feline);
        boolean expectedResult = true;
        boolean actualResult = lion.doesHaveMane();
        assertEquals("Некорректный результат вызова метода", expectedResult, actualResult);
    }

    @Test
    public void lionMaleTest() {
        Lion lion = new Lion("Самец", feline);
        boolean actualResult = lion.doesHaveMane();
        assertTrue("Некорректое значение свойства", actualResult);
    }

    @Test
    public void lionFemaleTest() {
        Lion lion = new Lion("Самка", feline);
        boolean actualResult = lion.doesHaveMane();
        assertFalse("Некорректое значение свойства", actualResult);
    }

    @Test(expected = Exception.class)
    public void lionUndefinedManeTest() {
        new Lion("Undefined", feline);
    }
}