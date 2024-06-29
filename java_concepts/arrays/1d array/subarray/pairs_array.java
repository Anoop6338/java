// to print all the possible pairs of an array
// (2,4)=(4,2)..... no need to print again and again

public class pairs_array {
    public static void pairs(int num[]) {
        int tp=0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + num[i] + "," + num[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total number of pairs : "+tp);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        pairs(numbers);
    }
}

//total no. of pairs = n(n-1)/2              
// here 5(4)/2=10
