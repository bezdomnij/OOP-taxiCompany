package com.codecool.taxicompany.cars;

import com.codecool.taxicompany.driver.Driver;

public abstract class Car {
    protected String uniqueId;
    protected int costPerWeek;
    protected int weeklyPassengerCount;
    protected Driver driver;

    public Car() {
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "uniqueId='" + uniqueId + '\'' +
                ", costPerWeek=" + costPerWeek +
                ", weeklyPassengerCount=" + weeklyPassengerCount +
                ", driver=" + driver +
                '}';
    }

}
