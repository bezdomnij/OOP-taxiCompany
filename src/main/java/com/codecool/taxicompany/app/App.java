package com.codecool.taxicompany.app;

import com.codecool.taxicompany.TaxiCompany;
import com.codecool.taxicompany.cars.Car;
import com.codecool.taxicompany.cars.Electric;
import com.codecool.taxicompany.cars.Gasoline;
import com.codecool.taxicompany.cars.SelfDriving;
import com.codecool.taxicompany.driver.Driver;

public class App {
    public static void main( String[] args ) {
        TaxiCompany company = new TaxiCompany();
        Driver driver1 = new Driver("Bela", (byte)35);
        Car car1 = new Gasoline();
        Driver driver2 = new Driver("Atesz", (byte)31);
        Car car2 = new Electric();
        Driver driver3 = new Driver("Petike", (byte)28);
        Car car3 = new Gasoline();
        Car car4 = new SelfDriving();
        System.out.println("============= hiring==================");
        company.hireDriver(driver1);
        company.hireDriver(driver2);
        company.hireDriver(driver3);
        company.registerCar(car1);
        company.registerCar(car2);
        company.registerCar(car3);
        company.registerCar(car4);
        System.out.println("========= allocating ============");
        company.allocateDrivers();
        System.out.println("============= results ==========");
        System.out.println(company);

        for (int i=0; i< 52; i++) {
            System.out.println(company.calcWeeklyProfit());
        }
    }
}
