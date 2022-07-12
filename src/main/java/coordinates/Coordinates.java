package coordinates;

import exceptions.NegativeCoordinateException;
import exceptions.OutOfBoundCoordinatesException;

public class Coordinates {
    private final int xCoordinate;
    private final int yCoordinate;

    public Coordinates(int xCoordinate, int yCoordinate) throws NegativeCoordinateException {
        if (xCoordinate < 0 || yCoordinate < 0) throw new NegativeCoordinateException();
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinates that = (Coordinates) o;

        if (xCoordinate != that.xCoordinate) return false;
        return yCoordinate == that.yCoordinate;
    }

    @Override
    public int hashCode() {
        int result = xCoordinate;
        result = 31 * result + yCoordinate;
        return result;
    }

    public boolean withIn(Coordinates coordinates) throws OutOfBoundCoordinatesException {
        if (coordinates.xCoordinate < 0 || coordinates.yCoordinate < 0) throw new OutOfBoundCoordinatesException();
        if (coordinates.xCoordinate > this.xCoordinate || coordinates.yCoordinate > this.yCoordinate)
            throw new OutOfBoundCoordinatesException();
        return true;
    }
}
