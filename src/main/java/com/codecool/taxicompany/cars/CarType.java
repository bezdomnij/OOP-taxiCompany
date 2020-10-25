package com.codecool.taxicompany.cars;

public enum CarType {
    GASOLINE (350),
    ELECTRIC (400),
    SELFDRIVING (740);

    private final int weeklyCarCost;

    CarType(int weeklyCarCost) {
        this.weeklyCarCost = weeklyCarCost;
    }

    public int getWeeklyCarCost() {
        return weeklyCarCost;
    }
}
