import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // variable declaration
        int num = 30;

        // copping variable value into the other variable
        int myAge = 23;
        int herAge = myAge;
        //System.out.println(herAge);

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
        //System.out.println(y);

        Point point1 = new Point(1, 1);
        Point point2 = point1;

        point2.x = 10;
        //System.out.println(point2);

        // display output
        //System.out.println(now);

        // string
        // String message = new String("Hello world");
        String message = "Hello world" + "!!";

        //System.out.println(message);
        //System.out.println(message.endsWith("!!"));
        //System.out.println(message.startsWith("!!"));
        //System.out.println(message.length());
        //System.out.println(message.indexOf("H"));
        //System.out.println(message.replace("!", "*"));
        //System.out.println(message); // string in java is immutable
        //System.out.println(message.toLowerCase());
        //System.out.println(message.toUpperCase());
        //System.out.println(message.trim()); // trim extra white space

        // escape sequence
        // write double quote
        String greeting = "Hello \"SAM\"";
        //System.out.println(greeting);

        // write slash
        String window = "c:\\Windows\\...";
        //System.out.println(window);

        // new line
        String window2 = "c:\n\\Windows\\...";
        //System.out.println(window2);

        // tab
        String window3 = "c:\t\\Windows\\...";
        //System.out.println(window3);

        // array
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 11;
        numbers[2] = 12;
        numbers[3] = 13;
        numbers[4] = 14;
        //System.out.println(Arrays.toString(numbers));

        int[] rolls = {1,2,4,3,5};
        Arrays.sort(rolls);
        //System.out.println("{rolls_length: "+rolls.length+"}");
        //System.out.println(Arrays.toString(rolls));

        // 2D array
        int[][] values = new int[2][3];
        values[0][0] = 1;

        int[][] points = {{1,2,3}, {4,5,6}};
        //System.out.println(Arrays.deepToString(values)); // use deepToString for matrix
        //System.out.println(Arrays.deepToString(points)); // use deepToString for matrix

        // constant
        final float pi = 3.1416F;

        // arithmatic expression
        int result = 10 + 3;
        double division = (double)10/(double)3;
        System.out.println(result);
        System.out.println(division);

        int n = 1;
        //n++; // increment
        n += 2; // n = n + 2;
        System.out.println(n);
    }
}
