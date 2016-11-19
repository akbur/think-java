import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner in = new Scanner(System.in);

        System.out.print("What is the Celsius temperature you would like to convert? ");
        celsius = in.nextDouble();
        fahrenheit = celsius * (9.0 / 5.0) + 32;

        System.out.printf("%.1f C = %.1f F\n", celsius, fahrenheit);
    }
}