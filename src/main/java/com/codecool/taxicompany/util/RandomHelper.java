package com.codecool.taxicompany.util;

import java.util.Random;

public class RandomHelper {
    private static Random random = new Random();

    public static int nextInt(int upper) {
        return random.nextInt(upper);
    }
}
