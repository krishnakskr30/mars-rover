import coordinates.Coordinates;

import java.util.Objects;

public class Rover {

    private final Coordinates coordinates;

    public Rover(Coordinates initialCoordinates) {

        coordinates = initialCoordinates;
    }

    public Coordinates currentLocation() {
        return this.coordinates;
    }
}
