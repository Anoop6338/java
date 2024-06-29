import java.util.*;
public class advance_pattern2 {
        /*
        print ---->     *         *  
                        * *     * *
                        * * * * * *
                        * * * * * *
                        * *     * *
                        *         *
        butterfly pattern
     */

     public static void pattern1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int num = sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j =1; j<=i; j++){ //star
                System.out.print("* ");
            }
            for(int k=2*(num-i);k>0;k--){
                System.out.print("  ");
            }

            for(int j =1; j<=i; j++){//star
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int i=num;i>=1;i--){
            for(int j =i; j>=1; j--){ //star
                System.out.print("* ");
            }
            for(int k=1;k<=2*(num-i);k++){
                System.out.print("  ");
            }

            for(int j =i; j>=1; j--){//star
                System.out.print("* ");
            }
            System.out.println();
        }
    sc.close();
    }

    /*
      print this -->            * * * * 
                               * * * * 
                              * * * * 
                             * * * * 
        rhombus                      
     */
    public static void pattern2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=row-1; j>=i;j--){//spaces
                System.out.print("  ");
            }
            for(int k=1;k<=row;k++){//star
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    /*
    print ---->                 * * * * 
                               *     * 
                              *     * 
                             * * * * 
     */
    public static void pattern3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();

        for(int i=1; i<=row;i++){
            for(int j=row-1;j>=i;j--){//spaces
                System.out.print("  ");
            }
            
            for(int m=1;m<=row;m++){//hollow rectangle
                if(i==1|| i==row || m==1 || m==row){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
        sc.close();

    }

    /*
            print -->   *
                       * *
                      * * *
                      * * *
                       * *
                        * 
     */

    public static void pattern4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int row = sc.nextInt();

        for(int i=1; i<=row; i++){
            for(int j=row-1; j>=i; j--){  //spaces
                System.out.print("  ");
            }
            for(int k =1; k<=(2*i)-1 ; k++){//star
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=row; i>=1; i--){
            for(int j=i; j<=row-1; j++){  //spaces
                System.out.print("  ");
            }
            for(int k =(2*i)-1 ; k>=1 ; k--){//star
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args) {
        //pattern1();
        //pattern2();
        //pattern3();
        pattern4();

    }
}
