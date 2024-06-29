import java.util.Scanner;

//import java.util.*;

public class function {
    public static int add(int num1, int num2) { // parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static int product(int num1, int num2){
        int product = num1*num2;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter yur 1st num : ");
        int a = sc.nextInt();
        System.out.print("Enter yur 2nd num : ");
        int b = sc.nextInt();

        int sum_main = add(a, b);// actual parameters or arguements
        System.out.println("sum is " + sum_main);

        int p = product(a,b);
        System.out.println("product is : "+p);

        sc.close();
    }
}
