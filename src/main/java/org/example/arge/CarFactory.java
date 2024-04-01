package org.example.arge;

public class CarFactory {

    public static void main(String[] args) {
        System.out.println("CAR R&D COMPANY");

        CarSkeleton electric = new ElectricCar("A","sustainable",110,40);
        System.out.println(electric.startEngine());
        System.out.println(electric.drive());


        CarSkeleton gas = new GasPoweredCar("B","not environmental",150,2);
        System.out.println(gas.startEngine());
        System.out.println(gas.drive());

        CarSkeleton hybrid = new HybridCar("C","Best of both",120,42,4);
        System.out.println(hybrid.startEngine());
        System.out.println(hybrid.drive());
    }
}
