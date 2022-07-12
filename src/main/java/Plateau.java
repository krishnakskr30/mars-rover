import coordinates.Coordinates;
import exceptions.NegativeCoordinateException;
import exceptions.OutOfBoundCoordinatesException;

public class Plateau {
    private final Coordinates topRightCoordinates;

    public Plateau(int topRightXCoordinate, int topRightYCoordinate) throws NegativeCoordinateException {
        this.topRightCoordinates=new Coordinates(topRightXCoordinate,topRightYCoordinate);
    }

    public boolean hasCoordinates(Coordinates coordinates) throws OutOfBoundCoordinatesException {
        return topRightCoordinates.withIn(coordinates);
    }
}
