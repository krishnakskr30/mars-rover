import coordinates.Coordinates;

public class Rover {

    private final Coordinates coordinates;
    Direction direction;

    public Rover(Coordinates initialCoordinates, Direction initialDirection) {

        coordinates = initialCoordinates;
        direction = initialDirection;
    }

    public Coordinates currentLocation() {
        return this.coordinates;
    }

    public Direction currentDirection() {
        return this.direction;
    }

    public void turnRight() {
        this.direction = Direction.E;
    }
}
