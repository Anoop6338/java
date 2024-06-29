import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you number to be reversed : ");
        int num = sc.nextInt();

        while(num>0){
            System.out.print(num%10);
            num /= 10;

        }
        sc.close();
    }

}
