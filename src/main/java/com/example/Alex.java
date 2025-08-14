package com.example;

import java.util.Arrays;
import java.util.List;

public class Alex extends Lion {

    List<String> alexFriends = Arrays.asList("Марти", "Глория", "Мелман");
    private static final Feline feline = new Feline();

    public Alex() throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends() {
        return alexFriends;
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }

}
