package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AlexTest {

    Alex alex;
// здесь без try-catch конструкции не запускался проект. почему так?
    {
        try {
            alex = new Alex();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testAlexFriendsListIsMartyGloriaMelman() {
        Assertions.assertEquals(Arrays.asList("Марти", "Глория", "Мелман"), alex.getFriends(), "Друзьями Алекса должны быть Марти, Глория и Мелман");
    }

    @Test
    public void testAmountOfAlexKittensIsZero() {
        Assertions.assertEquals(0, alex.getKittens(), "У Алекса должно быть 0 котят");
    }

    @Test
    public void testAlexPlaceOfLivingIsNewYorkZoo() {
        Assertions.assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving(), "Алекс должен жить в Нью-Йоркском зоопарке");
    }

    @Test
    public void testAlexHasMane() {
        assertTrue(alex.doesHaveMane(), "У Алекса должна быть грива");
    }
}