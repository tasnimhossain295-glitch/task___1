public class Main {
    public static void main(String[] args) {
        // --- Testing Task 1: Point Class ---
        System.out.println("=== Testing Point Class ===");
        Point p1 = new Point(5, 3);
        System.out.println("Initial p1: " + p1);
        System.out.printf("Distance from origin: %.2f%n", p1.distanceFromOrigin());

        p1.translate(2, 1);
        System.out.println("After translate(2, 1): " + p1);

        p1.setLocation(3, 4);
        System.out.println("After setLocation(3, 4): " + p1);
        System.out.println("New distance from origin: " + p1.distanceFromOrigin());

        Point p2 = new Point(6, 8);
        System.out.println("Point p2: " + p2);
        System.out.println("Distance between p1 and p2: " + p1.distance(p2));

        // --- Testing Task 2: Line Class ---
        System.out.println("\n=== Testing Line Class ===");
        Line defaultLine = new Line();
        System.out.println("Default line: " + defaultLine);
        System.out.println("Default line length: " + defaultLine.getLength());

        Line customLine = new Line(p1, p2);
        System.out.println("Custom line: " + customLine);
        System.out.println("Custom line length: " + customLine.getLength());

        customLine.setP1(new Point(0, 0));
        customLine.setP2(new Point(3, 4));
        System.out.println("Updated line: " + customLine);
        System.out.println("Updated line length: " + customLine.getLength());
    }
}
