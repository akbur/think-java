//public class Date {
//    public static void main(String[] args) {
//        String day, month;
//        int date, year;
//
//        day = "Friday";
//        month = "November";
//        date = 18;
//        year = 2016;
//
//        System.out.println("American format:");
//        System.out.println(day + ", " + month + " " + date + ", " + year);
//        System.out.println("European format:");
//        System.out.println(day + " " + date + " " + month + " " + year);
//
//    }
//}

public class PrintDate {

    public static void printAmerican(String day, String month, int date, int year) {
        System.out.printf("%s, %s %d, %d\n", day, month, date, year);
    }

    public static void printEuropean(String day, String month, int date, int year) {
        System.out.printf("%s %d %s %d\n", day, date, month, year);
    }

    public static void main(String[] args) {
        String day = "Saturday";
        String month = "November";
        int date = 19;
        int year = 2016;

        System.out.println("American format:");
        printAmerican(day, month, date, year);
        System.out.println("European format:");
        printEuropean(day, month, date, year);
    }
}