package org.example.arge;

public class CarSkeleton {

    private String name;
    private String description;


    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String startEngine(){
        System.out.println("Class name: " + getClass().getSimpleName());
        return getName() + " starting engine";
    };
    public String drive(){
        runEngine(this);
        return getName() + " is driving.";
    };
    public void runEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.getClass().getSimpleName());
        if(carSkeleton instanceof ElectricCar) {
           double avgKmPerCharge = ((ElectricCar)carSkeleton).getAvgKmPerCharge();
           int batterySize = ((ElectricCar)carSkeleton).getBatterySize();
            System.out.println("The car engine is starting with electric. Per charge: "+ avgKmPerCharge + " battery size: " + batterySize );
        } else if(carSkeleton instanceof GasPoweredCar) {
            double avgKmPerLiter = ((GasPoweredCar)carSkeleton).getAverageKmPerLiter();
            int cylinderAmount = ((GasPoweredCar)carSkeleton).getCylinders();
            System.out.println("The car engine is starting with gas power. Per litre: "+ avgKmPerLiter + " cylinder amount: " + cylinderAmount );
        } else if(carSkeleton instanceof HybridCar) {
            HybridCar hybridCar = ((HybridCar) carSkeleton);
            System.out.println("The car engine is starting with electric. Per charge: "+ hybridCar.getAvgKmPerLiter() + " battery size: " + hybridCar.getBatterySize() + " cylinder amount: " + hybridCar.getCylinders() );
        } else {
            System.out.println("invalid car type");
        }

    };

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
