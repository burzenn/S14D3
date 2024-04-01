package org.example.arge;

public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int cylinders;


    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
    }

    public void setAvgKmPerLiter(double avgKmPerLiter) {
        this.avgKmPerLiter = avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    @Override
    public String startEngine() {
        runEngine(this);
        return getName() + " car starting";
    }

    @Override
    public String drive() {
        return "run from gas powered car";
    }

    @Override
    public String toString() {
        return "GasPoweredCar{" +
                "avgKmPerLiter=" + avgKmPerLiter +
                ", cylinders=" + cylinders +
                '}';
    }
}
