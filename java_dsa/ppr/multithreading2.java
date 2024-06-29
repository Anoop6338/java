//using runnable

class A implements Runnable{
    public void run(){
        for(int i =1;i<=10; i++ ){
            System.out.println(" from A "+i);

        }
        System.out.println(" A completed");
    }
}

class B implements Runnable{
    public void run(){
        for(int i =1;i<=10; i++ ){
            System.out.println(" from B "+i);

        }
        System.out.println(" B completed");
    }
}


class multithreading2{
    public static void main(String args[]){
        A job1 = new A();
        B job2 = new B();

        Thread t1 = new Thread(job1);
        Thread t2 = new Thread(job2);

        t1.start();
        t2.start();
    }

}