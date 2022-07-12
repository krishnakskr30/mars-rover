import coordinates.Coordinates;
import exceptions.NegativeCoordinateException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CoordinatesTest {
    @Test
    void shouldNotCreateCoordinatesWhenNegativeXCoordinateIsGiven() {
        assertThrows(NegativeCoordinateException.class, () -> new Coordinates(-1, 0));
    }

    @Test
    void shouldNotCreateCoordinatesWhenNegativeYValueIsGiven() {
        assertThrows(NegativeCoordinateException.class, () -> new Coordinates(0, -1));
    }

    @Test
    void shouldNotCreateCoordinatesWhenBothXAndYValuesAreNegative() {
        assertThrows(NegativeCoordinateException.class, () -> new Coordinates(-1, -1));
    }
}
