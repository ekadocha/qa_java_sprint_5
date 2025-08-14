package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FelineParameterizedTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 0})
    void testSetFelineKittensCount(int kittensCount) {
        Feline feline = new Feline();
        Assertions.assertEquals(kittensCount, feline.getKittens(kittensCount), "Количество котят должно быть равно значению, переданному в getKittens");
    }
}