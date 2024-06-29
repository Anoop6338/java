import java.util.*;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*
         A
         BC
         DEF
         GHIJ
         */
        Character ch ='A';
        for(int c =1; c<=4; c++){
            for(int i=1; i<=c; i++){ 
                System.out.print(ch);
                ch++;
            }
        System.out.println();
        }
    sc.close();
    }
}
