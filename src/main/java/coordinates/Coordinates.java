package coordinates;

import exceptions.NegativeCoordinateException;

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
}
