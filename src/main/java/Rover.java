import coordinates.Coordinates;

public class Rover {

    private final Coordinates coordinates;
    char direction;

    public Rover(Coordinates initialCoordinates, char initialDirection) {

        coordinates = initialCoordinates;
        direction = initialDirection;
    }

    public Coordinates currentLocation() {
        return this.coordinates;
    }

    public char currentDirection() {
        return this.direction;
    }
}
