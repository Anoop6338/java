import java.util.*;

public class input_in_java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //to store till a space is encountered
        // String input = sc.next();
        // System.out.println(input);

        // to store the whole line
        // String input_full = sc.nextLine();
        // System.out.println(input_full);

        //to store an integer
        int number = sc.nextInt();
        System.out.println(number);

        //to store a float
        float price = sc.nextFloat();
        System.out.println(price);

        sc.close();
    }
}
