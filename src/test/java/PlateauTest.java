import coordinates.Coordinates;
import exceptions.NegativeCoordinateException;
import exceptions.OutOfBoundCoordinatesException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlateauTest {
    @Test
    void shouldCreatePlateauWithTopRightCoordinates() throws NegativeCoordinateException, OutOfBoundCoordinatesException {
        int xCoordinate = 1;
        int yCoordinate = 1;
        Coordinates topRightCoordinates = new Coordinates(xCoordinate, yCoordinate);
        int topRightXCoordinate = 1;
        int topRightYCoordinate = 1;
        Plateau plateau = new Plateau(topRightXCoordinate, topRightYCoordinate);

        assertTrue(plateau.hasCoordinates(topRightCoordinates));
    }

    @Test
    void shouldIdentifyTheCoordinatesOutOfBounds() throws NegativeCoordinateException {
        Plateau plateau = new Plateau(1, 1);
        Coordinates coordinates = new Coordinates(2, 1);

        assertThrows(OutOfBoundCoordinatesException.class, () -> plateau.hasCoordinates(coordinates));
    }
}