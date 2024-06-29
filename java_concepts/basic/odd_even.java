import java.util.*;

public class odd_even {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        if (num<=1){
            System.out.println("Number is negative");
        }
        else if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }

        sc.close();
    }
}
