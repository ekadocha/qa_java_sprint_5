package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AlexTest {

    @Spy
    Alex alex;

    @Test
    public void alexFriendsListIsMartyGloriaMelman() {
        Assertions.assertEquals(Arrays.asList("Марти", "Глория", "Мелман"), alex.getFriends(), "Друзьями Алекса должны быть Марти, Глория и Мелман");
    }

    @Test
    public void amountOfAlexKittensIsZero() {
        Assertions.assertEquals(0, alex.getKittens(), "У Алекса должно быть 0 котят");
    }

    @Test
    public void alexPlaceOfLivingIsNewYorkZoo() {
        Assertions.assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving(), "Алекс должен жить в Нью-Йоркском зоопарке");
    }

    @Test
    public void alexHasMane() {
        assertTrue(alex.doesHaveMane(), "У Алекса должна быть грива");
    }
}