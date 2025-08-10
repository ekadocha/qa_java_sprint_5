package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FelineParameterizedTest {

    @Spy
    Feline feline;

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 0})
    void setFelineKittensCount(int kittensCount) {
        Assertions.assertEquals(kittensCount, feline.getKittens(kittensCount), "Количество котят должно быть равно значению, переданному в getKittens");
    }
}