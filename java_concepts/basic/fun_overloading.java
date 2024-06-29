
//fuction overloading with different no. of parameters.

// public class fun_overloading {
//     public static int sum(int a, int b) {
//         return a+b;
//     }
//     public static int sum(int a, int b, int c) {
//         return a+b+c;
//     }
//     public static int sum(int a, int b, int c, int d) {
//         return a+b+c+d;
//     }

//     public static void main(String[] args) {
//         int num=sum(2,3);
//         System.out.println(num);

//         num=sum(2,3,4,5);
//         System.out.println(num);

//         num=sum(2,3,4);
//         System.out.println(num);
//     }
// }



// function overloading using different data types of parameteres.

public class fun_overloading {

    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(2.8f,3.2f));
    }
}