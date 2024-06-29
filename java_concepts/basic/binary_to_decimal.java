import java.util.*;

public class binary_to_decimal {
    public static void binToDec(int binNum){
        int dec = 0;
        int pow = 0;
        while(binNum>0){
            int lastDigit = binNum%10;
            dec = dec + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("output decimal no. = "+dec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your binary number");
        int a = sc.nextInt();

        binToDec(a);

        sc.close();
    }
}
