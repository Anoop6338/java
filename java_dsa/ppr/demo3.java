import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        int numer[] ={2,4,6,8};
        int denom[] ={1,2,0,2};

        for(int i=0; i<numer.length;i++){
            try{
                System.out.println(numer[i]/denom[i]);
            }
            catch(Exception e ){
                System.out.println("can't divide by zero   ");
                e.printStackTrace(); 

            }
        }
    }
}
