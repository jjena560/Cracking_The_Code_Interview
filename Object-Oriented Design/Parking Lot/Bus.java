public class Bus extends Vehicle {
    public Bus() {
        spotsNeeded = 5;
        size = VehicleSize.Large;
    }

    public boolean canFitAtSpot(ParkingSpot spot) {
        return spot.getSize() == VehicleSize.Large;
    }

    public void print() {
        System.out.print("B");
    }
}