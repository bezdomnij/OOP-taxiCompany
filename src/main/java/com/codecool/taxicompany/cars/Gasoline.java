package com.codecool.taxicompany.cars;

public class Gasoline extends Car {
    private static long idCounter = 1;
    private long id = idCounter++;
    private static final int  WEEKLY_COST = 350;
    private static final String TYPE = "GASOLINE";
    private double weeklyMaintenance;

    private CarType carType;

    public Gasoline() {
        this.costPerWeek = WEEKLY_COST;
        this.uniqueId = TYPE + this.id;
        this.weeklyMaintenance = 20;
        this.carType = CarType.GASOLINE;
    }

    public double getWeeklyMaintenance() {
        return weeklyMaintenance;
    }

    public void setWeeklyMaintenance(){
        this.weeklyMaintenance *= 1.1;
    }

    @Override
    public CarType getCarType() {
        return this.carType;
    }
}
