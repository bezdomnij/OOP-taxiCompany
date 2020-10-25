package com.codecool.taxicompany;

import com.codecool.taxicompany.cars.Car;
import com.codecool.taxicompany.cars.SelfDriving;
import com.codecool.taxicompany.driver.Driver;
import com.codecool.taxicompany.util.RandomHelper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaxiCompany {
    private List<Driver> drivers;
    private List<Car> cars;

    public TaxiCompany() {
        this.drivers = new ArrayList<>();
        this.cars = new ArrayList<>();
    }

    public void hireDriver(Driver driver){
        drivers.add(driver);
    }

    public void registerCar(Car car) {
        cars.add(car);
    }

    public void allocateDrivers() {
        Set<Car> outAlreadyCar = new HashSet<>();
        int i = outAlreadyCar.size();
        while (outAlreadyCar.size() != drivers.size()) {
            Car tempCar = cars.get(RandomHelper.nextInt(drivers.size()));
            if (!(tempCar instanceof SelfDriving) && (!outAlreadyCar.contains(tempCar))) {
                Driver actualDriver = drivers.get(i);
                tempCar.setDriver(actualDriver);
                actualDriver.setCar(tempCar);
            }
            outAlreadyCar.add(tempCar);

            i = outAlreadyCar.size();
        }
    }

    @Override
    public String toString() {
        StringBuilder sbd = new StringBuilder();
        for (Driver driver: drivers) {
            sbd.append(driver.toString());
            sbd.append("\n");
        }
        StringBuilder sbc = new StringBuilder();
        for (Car car: cars) {
            sbc.append(car.toString());
            sbc.append("\n");
        }

        return "TaxiCompany{" +
                "drivers=\n" + sbd.toString() +
                ", cars=\n" + sbc.toString() +
                '}';
    }
}
