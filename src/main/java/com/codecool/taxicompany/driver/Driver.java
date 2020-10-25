package com.codecool.taxicompany.driver;

import com.codecool.taxicompany.cars.Car;
import com.codecool.taxicompany.util.RandomHelper;

import java.util.HashSet;
import java.util.Set;

public class Driver {
    private final String mobileNumber;
    private final String name;
    private final byte age;
    private double salary;
    private final ExperienceLevel experienceLevel;
    private Car car;
    private static final Set<String> driverNumbers = new HashSet<>();

    public Driver(String name, byte age) {
        this.mobileNumber = String.format("%05d", RandomHelper.nextInt(100000));
        this.experienceLevel = this.guessExperienceLevel();
        this.name = name;
        this.age = age;
        addNumber();
        System.out.println(driverNumbers);
    }

    public ExperienceLevel getExperienceLevel() {
        return experienceLevel;
    }

    public int getSalary() {
        if (car != null)  return this.car.getCarType().getWeeklyCarCost();
        return 0;
    }

    private void addNumber() {
        driverNumbers.add(this.mobileNumber);
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "mobileNumber='" + mobileNumber + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", experienceLevel=" + experienceLevel +
                ", car=" + car +
                '}';
    }

    private ExperienceLevel guessExperienceLevel() {
        int guess = RandomHelper.nextInt(3);
        switch (guess) {
            case 0: return ExperienceLevel.BEGINNER;
            case 1: return ExperienceLevel.ADVANCED;
            case 2: return ExperienceLevel.PROFESSIONAL;
            default:
                throw new IllegalStateException("Unexpected value: " + guess);
        }
    }

}
