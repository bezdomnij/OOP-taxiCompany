package com.codecool.taxicompany.cars;

public class Electric extends Car {
    private static long idCounter = 1;
    private long id = idCounter++;
    private static final int  WEEKLY_COST = 400;
    private static final String TYPE = "ELECTRIC";
    private CarType carType;

    public Electric() {
        this.costPerWeek = WEEKLY_COST;
        this.uniqueId = TYPE + this.id;
        this.carType = CarType.ELECTRIC;
    }
    @Override
    public CarType getCarType() {
        return this.carType;
    }
}
