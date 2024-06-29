import java.util.Scanner;

public class factorial {
    public static int fact(int num){
        int f=1;
        for (int i=1; i<=num; i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        int ans = fact(a);
        System.out.println(ans);

        sc.close();
    }
}
