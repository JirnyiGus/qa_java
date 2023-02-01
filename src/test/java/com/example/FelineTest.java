package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void getFamilyTest() {
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", expectedResult, actualResult);
    }

    @Test
    public void getKittenTest() {
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals("Получено некорректное значение", expectedResult, actualResult);
    }

    @Test
    public void getKittensTest() {
        int expectedResult = 5;
        int actualResult = feline.getKittens(5);
        assertEquals("Получено некорректное значение", expectedResult, actualResult);
    }

    @Test
    public void predatorMeatFoodTest() {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals("Некорректный результат вызова метода", expectedResult, actualResult);
    }

    @Test
    public void predatorFoodTest() {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.getFood("Хищник");
        assertEquals("Получен некорректный список", expectedResult, actualResult);
    }

    @Test
    public void herbivoreFoodTest() {
        List<String> expectedResult = List.of("Трава", "Различные растения");
        List<String> actualResult = feline.getFood("Травоядное");
        assertEquals("Получен некорректный список", expectedResult, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void undefinedFoodTest() {
        feline.getFood("Undefined");
    }
}