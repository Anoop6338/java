import java.util.*;

abstract class shapes{
    abstract void draw();
}


class rectangle extends shapes{
    void draw(){
        System.out.println("this is rectangle");
    }
}

class circle extends shapes{
    void draw(){
        System.out.println("this is circle");
    }
}
public class demo2 {
    public static void main(String[] args) {
        shapes c = new circle();
        c.draw();

        shapes r = new rectangle();
        r.draw();
    }
}
