package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class CatTest {

    @Mock
    Feline feline;

    @Test
    public void testCatSaysMeow() {
        Cat cat = new Cat(feline);
        Assertions.assertEquals("Мяу", cat.getSound(), "Кот должен говорить Мяу");
    }

    @Test
    public void testCatGetFoodReturnsPredatorsFoodList() throws Exception {
        Cat cat = new Cat(feline);
        List<String> predatorFoodList = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(predatorFoodList);
        Assertions.assertEquals(predatorFoodList, cat.getFood(), "Рацион кошек должен включать в себя животных, птиц и рыб");
    }
}