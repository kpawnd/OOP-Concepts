public class SportsCar extends Vehicle {
    private int numSpoilers;

    public SportsCar(String make, String engineType, int fuelCapacity, Colour color, int numSpoilers) {
        super(make, engineType, fuelCapacity, color);
        this.numSpoilers = numSpoilers;
    }

    public int getNumSpoilers() {
        return numSpoilers;
    }
}