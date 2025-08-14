package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class FelineTest {

    @Test
    void testFelineEatMeatReturnsPredatorsFoodList() throws Exception {
        Feline feline = new Feline();
        List<String> predatorFoodList = Arrays.asList("Животные", "Птицы", "Рыба");
        Assertions.assertEquals(predatorFoodList, feline.eatMeat(), "Рацион кошачьих должен включать в себя животных, птиц и рыб");
    }

    @Test
    void testFelineFamilyIsFeline() {
        Feline feline = new Feline();
        Assertions.assertEquals("Кошачьи", feline.getFamily(), "Название семейства должно быть Кошачьи");
    }

    @Test
    void testDefaultFelineKittensCountIsOne() {
        Feline feline = new Feline();
        Assertions.assertEquals(1, feline.getKittens(), "По умолчанию у представителя кошачьих должен быть один котенок");
    }

}