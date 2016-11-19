public class Time {
  public static void main(String[] args) {
    // current time
    int hour, minute, second;
    hour = 20;
    minute = 29;
    second = 45;

    System.out.print("Seconds since midnight: ");
    System.out.println(((hour * 60) + minute) * 60 + second);
  }
}