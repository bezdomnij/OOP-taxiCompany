package com.codecool.taxicompany.driver;

import com.codecool.taxicompany.cars.Car;
import com.codecool.taxicompany.util.RandomHelper;

public class Driver {
    private final String mobileNumber;
    private final String name;
    private final byte age;
    private int salary;
    private final ExperienceLevel experienceLevel;
    private Car car;


    public Driver(String name, byte age) {
        this.mobileNumber = String.format("%05d", RandomHelper.nextInt(100000));
        this.experienceLevel = this.guessExperienceLevel();
        this.name = name;
        this.age = age;
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
                ", experienceLevel=" + experienceLevel +
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
