package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine= Boolean.TRUE;
        this.wheels= 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }


    private void printClassName() {
        System.out.println("Class name: " + getClass().getSimpleName());
    }
    public String startEngine(){
        printClassName();
        return "The car's engine is starting.";
    }

    public String accelerate(){
        printClassName();
        return "The car is accelerating.";
    }

    public String brake(){
        printClassName();
        return "The car is braking.";
    }

}
