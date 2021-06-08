public class Car extends Vehicle {
    public Car() {
        spotsNeeded = 5;
        size = VehicleSize.Large;
    }

    public boolean canFitAtSpot(ParkingSpot spot) {
        return spot.getSize() == VehicleSize.Large;
    }

    public void print() {
        System.out.print("C");
    }
}