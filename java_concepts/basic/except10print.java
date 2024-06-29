
// Print all the numbers given by user except multiple of 10
import java.util.*;

public class except10print {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        while(true){
            System.out.print("Enter your number : ");
            int num = sc.nextInt();

            if (num%10==0){
                continue;
            }
            System.out.println(num);
            System.out.println("You want to enter more ? (y/n) ");
            
            Character ans = sc.next().charAt(0);
            if(ans==110){
                break;
            } 
        }
        sc.close();
    }
}
