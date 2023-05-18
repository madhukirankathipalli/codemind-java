import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int decimal = 0;
        int power = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(s.charAt(i));
            decimal += digit * Math.pow(8, power);
            power++;
        }
        System.out.println(decimal);
    }
}