package com.codecool.taxicompany.cars;

public class Gasoline extends Car {
    private static long idCounter = 1;
    private long id = idCounter++;
    private static final int  WEEKLY_COST = 350;
    private static final String TYPE = "GASOLINE";
    private double weeklyMaintenance;

    public Gasoline() {
        this.costPerWeek = WEEKLY_COST;
        this.uniqueId = TYPE + this.id;
        this.weeklyMaintenance = 20;
    }

    public void setWeeklyMaintenance(){
        this.weeklyMaintenance *= 1.1;
    }
}
