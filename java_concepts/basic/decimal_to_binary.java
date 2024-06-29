import java.util.Scanner;

public class decimal_to_binary {
    public static void DecToBin(int num){
        int BinNum = 0;
        int pow =0;
        while(num>0){
            BinNum = BinNum + ((num%2) * (int)Math.pow(10, pow));
            pow++;
            num=num/2;
        }
        System.out.println("your binary num is : "+ BinNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your decimal number : ");
        int a = sc.nextInt();

        DecToBin(a);
        
        sc.close();
    }
}
