package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void getVoiceTest() {
        Cat cat = new Cat(new Feline());
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        assertEquals("Некорректный результат вызова метода", expectedResult, actualResult);
    }

    @Test
    public void getFoodTest() {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = cat.getFood();
        assertEquals("Некорректный результат вызова метода", expectedResult, actualResult);
    }

    @Test
    public void getFamilyTest() {
        Cat cat = new Cat(feline);
        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualResult = cat.getFamily();
        assertEquals("Некорректный результат вызова метода", expectedResult, actualResult);
    }
}