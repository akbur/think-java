public class Hello {

   public static void main(String[] args) {
    String firstLine = "Hello, again!";
    // generate some simple output
    System.out.println("Hello, World!");
    System.out.print("The value of firstLine is: ");
    System.out.println(firstLine);

    int hour = 11;
    int minute = 59;
    System.out.print("The current time is: ");
    System.out.print(hour);
    System.out.print(":");
    System.out.print(minute);
    System.out.println(".");

    System.out.print("Number of minutes since midnight: ");
    System.out.println(hour * 60 + minute);

    double pi;
    pi = 3.14159;
    double minutes = 59.0;
    System.out.print("Fraction of the hour that has passed: ");
    System.out.println(minutes / 60.0);

    System.out.println(1 + 2 + "Hello");
    System.out.println("Hello" + 1 + 2);
  }
}