package recursion.level2;

public class countNode {
    public static void main(String[] args) {
        int count[] = {0};
        int n = 2;
        nodeCount(n, count);        //using array of size 1
        System.out.println("Number of node = "+count[0]);


        nodeCounter(n);             //using global counter variable
        System.out.println("number of nodes = "+counter);


    }


    static void nodeCount(int n, int count[]){  //using array of size 1
        if(n==0){
            count[0]++;
        }
        else{
            count[0]++;
            nodeCount(n-1, count);
            nodeCount(n-1, count);
        }
    }


    static int counter = 0;//making of global variable
    static void nodeCounter(int n){  //using global counter variable
        if(n==0){
            counter++;
        }
        else{
            counter++;
            nodeCounter(n-1);
            nodeCounter(n-1);
        }
    }


}
