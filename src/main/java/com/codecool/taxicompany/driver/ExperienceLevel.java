package com.codecool.taxicompany.driver;

public enum ExperienceLevel {
    BEGINNER (15),
    ADVANCED (25),
    PROFESSIONAL (40);

    private final int weeklyMaxRideCount;

    ExperienceLevel(int weeklyMaxRideCount) {
        this.weeklyMaxRideCount = weeklyMaxRideCount;
    }

    public int getWeeklyMaxRideCount() {
        return weeklyMaxRideCount;
    }
}