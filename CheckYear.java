import java.util.*;

public class CheckYear {
    static boolean checkYear( int year ) {
        // Return true if year is multiplr of 4 and not 100
        // Or year is multiple of 400
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.print(year + " is ");
        System.out.println(checkYear(year) ? "Leap Year" : "Not a Leap Year");
    }
}
