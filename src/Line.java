/**
 * Represents a line segment defined by two endpoints (p1 and p2) in a 2D space.
 */
public class Line {
    /** The starting point of the line. */
    private Point p1;

    /** The ending point of the line. */
    private Point p2;

    /**
     * Default constructor initializing both endpoints to the origin (0, 0).
     */
    public Line() {
        this.p1 = new Point(0, 0);
        this.p2 = new Point(0, 0);
    }

    /**
     * Parameterized constructor creating a line between two given points.
     *
     * @param p1 the starting point
     * @param p2 the ending point
     */
    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Returns the starting point of the line.
     *
     * @return starting Point p1
     */
    public Point getP1() {
        return p1;
    }

    /**
     * Sets the starting point of the line.
     *
     * @param p1 the new starting Point
     */
    public void setP1(Point p1) {
        this.p1 = p1;
    }

    /**
     * Returns the ending point of the line.
     *
     * @return ending Point p2
     */
    public Point getP2() {
        return p2;
    }

    /**
     * Sets the ending point of the line.
     *
     * @param p2 the new ending Point
     */
    public void setP2(Point p2) {
        this.p2 = p2;
    }

    /**
     * Calculates and returns the length of the line segment between p1 and p2.
     *
     * @return the length of the line
     */
    public double getLength() {
        return p1.distance(p2);
    }

    /**
     * Returns a string representation showing the start and end points of the line.
     *
     * @return formatted string of the line's endpoints
     */
    @Override
    public String toString() {
        return "Line from " + p1.toString() + " to " + p2.toString();
    }
}
