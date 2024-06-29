package String;

import java.util.Scanner;

public class countWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you line");

        String s = sc.nextLine();
        s =s.trim();    // if we add space in the 1st and last of the string
        int count=1;

        if(s ==""){
            count=0;
        }
        else{
            for(int i=0; i<s.length();i++){
                if(s.charAt(i)==' '&& s.charAt(i+1)!=' '){
                    count++;
                }
            }
        }
        System.out.println(count);

        sc.close();
    }
}
