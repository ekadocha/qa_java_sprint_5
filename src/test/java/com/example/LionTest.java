package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LionTest {

    @Mock
    Feline feline;

    @Test
    public void testLionMaleHasMane() throws Exception {
        Lion lionM = new Lion("Самец", feline);
        assertTrue(lionM.doesHaveMane(), "Самец должен иметь гриву");
    }

    @Test
    public void testLionFemaleDoesNotHaveMane() throws Exception {
        Lion lionF = new Lion("Самка", feline);
        assertFalse(lionF.doesHaveMane(), "У самки не должно быть гривы");
    }

    @Test
    public void testLionWithRandomSexThrowsReadableError() {
        Exception exception = assertThrows(
                Exception.class,
                () -> {
                    Lion lionError = new Lion("Random", feline);
                }
        );
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    public void testLionGetFoodReturnsPredatorsFoodList() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> predatorFoodList = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(predatorFoodList);
        Assertions.assertEquals(predatorFoodList, lion.getFood(), "Рацион льва должен включать в себя животных, птиц и рыб");
    }

    @Test
    public void testDefaultFelineKittensCountIsOne() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assertions.assertEquals(1, lion.getKittens(), "По умолчанию у львов есть один львенок");
    }

}