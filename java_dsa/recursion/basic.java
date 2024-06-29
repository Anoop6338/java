package recursion;

public class basic {
    public static void main(String[] args) {
        print(5);
    }

    static void print(int n){
        if(n==0){
            System.out.println("X");
        }
        else{
            // System.out.println(n);   // return descending order
            print(n-1);
            System.out.println(n);      // returns increasing order
        }
    }
}
