import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // variable declaration
        int num = 30;

        // copping variable value into the other variable
        int myAge = 23;
        int herAge = myAge;
        System.out.println(herAge);

        // types of data
        // primitive
        // 1. byte
        // 2. short
        // 3. int
        // 4. long
        // 5. float
        // 6. double
        // 7. char
        // 8. boolean

        byte age = 31;
        int viewsCount = 123_456_789; // for more readability
        long viewsCount2 = 3_123_456_789L; // L suffix for Long to solve the conflict between int and long
        float price = 10.99F; // F suffix for Float to solve the conflict between Double and Float
        char letter = 'A'; // char represents single character
        String letters = "Apple"; // String represents multiple character
        boolean isReal = true;

        // Reference type
        Date now = new Date();

        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        Point point1 = new Point(1, 1);
        Point point2 = point1;

        point2.x = 10;
        System.out.println(point2);

        // display output
        System.out.println(now);
    }
}