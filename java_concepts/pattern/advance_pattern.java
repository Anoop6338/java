import java.util.Scanner;

//solve these patterns by analysing in a matrix shape.

public class advance_pattern {
    
    /*
            print--->     * * * * *
                          *       * 
                          *       * 
                          * * * * * 
     */

    public static void pattern1(int rows, int col){
        for(int i =1; i<=rows; i++){
            for(int j=1; j<=col;j++){
                if(i == 1 || i == rows || j==1 || j==col  ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    /*
            print--->         *
                           *  *
                         * *  *
                       * * *  *
     */

    public static void pattern2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of stars at last row : ");
        int num = sc.nextInt();

        for (int i =1; i<=num; i++){
            for(int j=num-1; j>=i; j--){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }

    /*
        print --->      1 2 3 4 5
                        1 2 3 4
                        1 2 3 
                        1 2 
                        1 
     */
    public static void pattern3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter largest number : ");
        int num = sc.nextInt();
        
        for(int i=num; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        sc.close();
    }

    /*
        print this --->     1
                            2  3
                            4  5  6
                            7  8  9  10
                            11 12 13 14 15
     */

    public static void pattern4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int num = sc.nextInt();

        int number=1;
        for(int i =1; i<=num; i++){
            for(int j =1; j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        sc.close();
    }

    /*
            print this --->     1
                                0 1
                                1 0 1
                                0 1 0 1
                                1 0 1 0 1
     */
    public static void pattern5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }


    public static void main(String[] args) {
        //pattern1(4, 5);
        //pattern2();
        //pattern3();
        //pattern4();
        //pattern5();
       
    }
    
}
