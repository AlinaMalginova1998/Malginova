package star;

/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coord  **/
    public int xCoord;

    /** Y coord **/
    public int yCoord;


    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    public Location()
    {
        this(0, 0);
    }

    public boolean equals(Object obj)
    {
        if (obj == null) {
            return false;
        }

        if (obj instanceof Location) {
            Location other = (Location) obj;

            return xCoord == other.xCoord &&
                    yCoord == other.yCoord;
        }
        return false;
    }

    public int hashCode()
    {
        int result = 11;

        result = 17 * result + (xCoord * 17);
        result = 7 * result + (yCoord * 23);

        return result;
    }
}