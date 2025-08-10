package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
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
    Cat cat;

    @BeforeEach
    void createCat() {
        cat = new Cat(feline);
    }

    @Test
    public void catSaysMeow() {
        Assertions.assertEquals("Мяу", cat.getSound(), "Кот должен говорить Мяу");
    }

    @Test
    public void catGetFoodReturnsPredatorsFoodList() throws Exception {
        List<String> predatorFoodList = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(predatorFoodList);
        Assertions.assertEquals(predatorFoodList, cat.getFood(), "Рацион кошек должен включать в себя животных, птиц и рыб");
    }
}