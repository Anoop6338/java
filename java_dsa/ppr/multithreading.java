// using thread class
class A extends Thread{
    public void run(){
        for(int i =1;i<=10; i++ ){
            System.out.println("thread from A "+i);

        }
        System.out.println("thread A completed");
    }
}

class B extends Thread{
    public void run(){
        for(int i =1;i<=10; i++ ){
            System.out.println("thread from B "+i);
        }
        System.out.println("thread B completed");
    }
}


public class multithreading{
    public static void main(String args[]){
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }

}