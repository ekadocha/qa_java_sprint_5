package com.example;

import java.util.Arrays;
import java.util.List;

public class Alex extends Lion {

    List<String> alexFriends = Arrays.asList("Марти", "Глория", "Мелман");

    public Alex() throws Exception {
        super("Самец");
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
