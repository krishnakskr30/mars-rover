import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {
    @Test
    void shouldProvideCurrentCoordinates() {
        Rover rover = new Rover(0, 0);
        int expectedYCoordinate = 0;
        int expectedXCoordinate = 0;

        int actualXCoordinate = rover.currentXLocation();
        int actualYCoordinate = rover.currentYLocation();

        assertEquals(actualXCoordinate, expectedXCoordinate);
        assertEquals(actualYCoordinate, expectedYCoordinate);
    }
}
