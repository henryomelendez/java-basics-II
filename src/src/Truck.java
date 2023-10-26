public class Truck extends Vehicle{
    private boolean truckWithbed;
    public Truck(int numOfDoors, int tires, boolean truckWithbed) {
        super(numOfDoors, tires);
        this.truckWithbed = truckWithbed;
    }

}
