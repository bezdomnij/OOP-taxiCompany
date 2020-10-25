package com.codecool.taxicompany;

import com.codecool.taxicompany.cars.Car;
import com.codecool.taxicompany.driver.Driver;

import java.util.Set;

public class TaxiCompany {
    private Set<Driver> drivers;
    private Set<Car> cars;

    public void hireDriver(Driver driver){
        drivers.add(driver);
    }
}
