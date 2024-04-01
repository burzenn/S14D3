package org.example;

import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        System.out.println("PACIFIC CAR COMPANY");

        Car car = new Car(8, "Base car");
        printCarInfo(car);

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        printCarInfo(mitsubishi);

        Car ford = new Ford(6, "Ford Falcon");
        printCarInfo(ford);

        Car holden = new Holden(6, "Holden Commodore");
        printCarInfo(holden);




    }

    private static void printCarInfo(Car car) {
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
    }
}
