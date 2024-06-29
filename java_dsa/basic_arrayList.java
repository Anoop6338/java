import java.util.ArrayList;
import java.util.Scanner;

public class basic_arrayList {

    public static void main(String[] args) {

       // //array list for integers
        // ArrayList<Integer> al = new ArrayList<>();
        // Scanner sc = new Scanner(System.in);

        // while(true){
        //     System.out.println("Enter a number : ");
        //     int n = sc.nextInt();
        //     if (n>0){
        //         al.add(n);
        //     }
        //     else{
        //         break;
        //     }
        // }
        // System.out.println(al);
        // sc.close();

        //array list for String

        ArrayList<String> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a name :");
            String name = sc.nextLine();

            if(name.equals("")){
                break;
            }
            al.add(name);
        }
        System.out.println(al);
        sc.close();
    }
}