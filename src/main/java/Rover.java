public class Rover {
    private final int x;
    private final int y;

    public Rover(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int currentYLocation() {
        return this.y;
    }

    public int currentXLocation() {
        return this.x;
    }
}
