package com.codecool.taxicompany.app;

import com.codecool.taxicompany.TaxiCompany;
import com.codecool.taxicompany.cars.Car;
import com.codecool.taxicompany.cars.Electric;
import com.codecool.taxicompany.cars.Gasoline;
import com.codecool.taxicompany.driver.Driver;
import com.codecool.taxicompany.util.RandomHelper;

public class App {
    public static void main( String[] args ) {
        TaxiCompany company = new TaxiCompany();
        Driver driver1 = new Driver("Bela", (byte)35);
        Car car1 = new Gasoline();
        System.out.println(driver1);
        System.out.println(car1);
        Driver driver2 = new Driver("Atesz", (byte)31);
        Car car2 = new Electric();
        System.out.println(driver2);
        System.out.println(car2);

    }
}
