public class Motorcycle extends Vehicle {
    public Motorcycle() {
        spotsNeeded = 5;
        size = VehicleSize.Large;
    }

    public boolean canFitAtSpot(ParkingSpot spot) {
        return spot.getSize() == VehicleSize.Large;
    }

    public void print() {
        System.out.print("M");
    }
}