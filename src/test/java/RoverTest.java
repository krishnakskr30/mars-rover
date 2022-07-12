import coordinates.Coordinates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {
    @Test
    void shouldProvideCurrentCoordinates() {
        Coordinates initialCoordinates = new Coordinates(0, 0);
        Rover rover = new Rover(initialCoordinates, 'N');
        Coordinates expectedCoordinates = new Coordinates(0, 0);

        Coordinates actualCoordinates = rover.currentLocation();

        assertEquals(actualCoordinates, expectedCoordinates);
    }

    @Test
    void shouldProvideCurrentDirection() {
        Coordinates initialCoordinates = new Coordinates(0, 0);
        char initialDirection = 'N';
        Rover rover = new Rover(initialCoordinates, initialDirection);

        char actualDirection = rover.currentDirection();

        assertEquals(initialDirection, actualDirection);
    }
}
