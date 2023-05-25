import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // side a
        int b = scanner.nextInt(); // side b
        int c = scanner.nextInt(); // side c

        double area = calculateTriangleArea(a, b, c);
        System.out.printf("%.2f", area);
    }

    private static double calculateTriangleArea(int a, int b, int c) {
        // Calculate the semi-perimeter
        double s = (a + b + c) / 2.0;

        // Calculate the area using Heron's formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        return area;
    }
}
