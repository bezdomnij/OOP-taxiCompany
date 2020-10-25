package com.codecool.taxicompany.driver;

import com.codecool.taxicompany.util.RandomHelper;

public class Driver {
    String mobileNumber;
    String name;
    byte age;
    int salary;
    ExperienceLevel experienceLevel;

    public Driver(String name, byte age) {
        this.mobileNumber = String.format("%05d", RandomHelper.nextInt(100000));
        this.experienceLevel = this.guessExperienceLevel();
        this.name = name;
        this.age = age;
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
