package com.codecool.taxicompany.cars;

public class SelfDriving extends Car {
    private static final int MAX_WEEKLY_PASSENGER_COUNT = 70;
    private static long idCounter = 1;
    private long id = idCounter++;
    private static final String TYPE = "SELFDRIVING";
    private static final int  WEEKLY_COST = 740;

    public SelfDriving() {
        this.costPerWeek = WEEKLY_COST;
        this.uniqueId = TYPE + this.id;
    }
}
