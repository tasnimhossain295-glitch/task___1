/**
 * Represents a point in a two-dimensional (2D) coordinate space.
 */
public class Point {
    /** The x-coordinate of the point. */
    private int x;

    /** The y-coordinate of the point. */
    private int y;

    /**
     * Constructs a new Point with the specified x and y coordinates.
     *
     * @param x the x-coordinate
     * @param y the y-coordinate
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Returns the x-coordinate of this point.
     *
     * @return the x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the x-coordinate of this point.
     *
     * @param x the new x-coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Returns the y-coordinate of this point.
     *
     * @return the y-coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the y-coordinate of this point.
     *
     * @param y the new y-coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Updates both the x and y coordinates of this point.
     *
     * @param x the new x-coordinate
     * @param y the new y-coordinate
     */
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Translates (moves) this point by dx along the x-axis and dy along the y-axis.
     *
     * @param dx the distance to move along the x-axis
     * @param dy the distance to move along the y-axis
     */
    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Calculates the Euclidean distance from the origin (0, 0) to this point.
     *
     * @return the distance from the origin
     */
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    /**
     * Calculates the Euclidean distance between this point and another point p.
     *
     * @param p the target Point
     * @return the distance between this point and p
     */
    public double distance(Point p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Returns a string representation of the point in the format [x;y].
     *
     * @return formatted string representing the point's coordinates
     */
    @Override
    public String toString() {
        return "[" + x + ";" + y + "]";
    }
}