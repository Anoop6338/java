import java.util.*;

public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        double area = 3.14*radius*radius;

        
        System.out.println("Area of circle = " + area);



        sc.close();
    } 
}
