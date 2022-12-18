package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        getWheels(wheels);
        getType(type);
        getDoors(doors);
        getGears(gears);
        isManual(isManual);
        getSeats(seats);
        setCurrentGear(1);
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }


    //Getters
    public int getWheels(int wheels) {
        return wheels;
    }

    public String getType(String type) {
        return type;
    }

    public int getDoors(int doors) {
        return doors;
    }

    public int getGears(int gears) {
        return gears;
    }

    public boolean isManual(boolean isManual) {
        return isManual;
    }

    public int getCurrentGear(int currentGear) {
        return currentGear;
    }

    public int getSeats(int seats) {
        return seats;
    }
}
