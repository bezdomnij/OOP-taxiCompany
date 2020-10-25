package com.codecool.taxicompany.cars;

import com.codecool.taxicompany.driver.Driver;

public abstract class Car {
    protected String uniqueId;
    protected int costPerWeek;
    protected int weeklyPassengerCount;
    protected int driversWeeklyMaxRideCount;
    protected Driver driver;

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{uniqueId='" + uniqueId + '\'' +
                ", costPerWeek=" + costPerWeek +
                ", weeklyPassengerCount=" + weeklyPassengerCount +
                ", driversWeeklyMaxRideCount=" + driversWeeklyMaxRideCount +
                '}';
    }

}
