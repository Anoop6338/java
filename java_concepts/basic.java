import java.util.*;

public class basic {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    /* 
        //invoke methods
        String str = "abcd";    //Method 1
        String str2 = new String("xyz");    //Mathod 2
        //there is diference in these two methods which we will discuss later
        
        //Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        //String name = sc.next();    // just take input till space

        String name = sc.nextLine();    //takes whole line as input

        System.out.println(name);

        System.out.println(name.length());  // prints length of string

    */

        //Concatination
        String firstname = "Anoop";
        String lastname = "Kumar";

        String fullname = firstname + " "+ lastname;
        //System.out.println(fullname);

        printLetters(fullname);

    }
}

