import java.util.Arrays;

class Abc{
    Abc(){
        System.out.println("this is class Abc");
    }
}


class defi extends Abc {
    String name;
    int age;
    defi(){
        System.out.println("this is class defi");
    };

    defi(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println(name +" "+ age);
    }
    
}

class sum{
    int a, b;
    float c;
    void display(int a, int b, float c){
        System.out.println(a+b+c);
    }
}


public class demo {
    public static void main(String[] args) {
        defi obj1 = new defi();
        defi obj2 = new defi("anoop",25);
        obj2.display();


        sum obj3 = new sum();
        obj3.display(2,3,5.0f);

        int arr[] = new int[5];
        arr[0]=2;
        System.out.println(Arrays.toString(arr));

    }
}
