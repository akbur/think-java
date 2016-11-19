public class Date {
  public static void main(String[] args) {
    String day, month;
    int date, year;

    day = "Friday";
    month = "November";
    date = 18;
    year = 2016;

    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);
    System.out.println("European format:");
    System.out.println(day + " " + date + " " + month + " " + year);

  }
}