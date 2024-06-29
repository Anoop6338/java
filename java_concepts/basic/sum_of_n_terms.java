import java.util.*;

public class sum_of_n_terms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        int sum=0;
        int i=0;

        while(i<=num){
            sum +=i;
            i++;
        }
        System.out.println("Sum to "+num+" terms is : "+sum);

        sc.close();
    }
    
}
