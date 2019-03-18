

public class WaterBottle {

    private double volume;

    public WaterBottle(double volume) {
        this.volume = volume;
    }

    public double isFull() {
        return volume;
    }

    public double isEmpty() {
        volume = 0;
        return volume;
    }

    public double takeDrink() {
        return volume -= 10;
    }

}
