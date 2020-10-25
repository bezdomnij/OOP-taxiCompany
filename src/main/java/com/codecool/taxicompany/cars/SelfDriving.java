package com.codecool.taxicompany.cars;

public class SelfDriving extends Car {
    private final int MAX_WEEKLY_PASSENGER_COUNT = 70;
    private static long idCounter = 1;
    private long id = idCounter++;
    private static final String TYPE = "SELFDRIVING";
    private static final int  WEEKLY_COST = 740;
    private CarType carType;

    public SelfDriving() {
        this.costPerWeek = WEEKLY_COST;
        this.uniqueId = TYPE + this.id;
        this.carType = CarType.SELFDRIVING;
    }

    @Override
    public CarType getCarType() {
        return this.carType;
    }

    public int getMaxWeeklyPassengerCount() {
        return MAX_WEEKLY_PASSENGER_COUNT;
    }
}
