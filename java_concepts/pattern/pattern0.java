import java.util.Scanner;

public class pattern0 {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    
    System.out.print("Number of nums : ");
    Integer num = sc.nextInt();

        for(int c =1; c<=num; c++){
            for(int i =1; i<=c; i++){
                System.out.print("*");
            }
        System.out.println();
        }

    System.out.println();
    System.out.println();


        for (int c = 1; c<=num; c++){
            for(int i =num-c; i>=0; i--){
                System.out.print("*");
            }
        System.out.println();
        }

        // for (int c = 1; c<=num; c++){
        //     for(int i=1; i<=num-c+1; i++){
        //         System.out.print("*");
        //     }
        // System.out.println();
        // }

    
    System.out.println();
    System.out.println();
        
        for(int c=1; c<=num; c++){
            for(int i=1; i<=c; i++){
                System.out.print(i);
            }
            System.out.println();
        }
               
    sc.close();
   } 
}
