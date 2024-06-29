/*
    Time complexity is O(n^2)
 */


public class Insertion_sort {
    public static void insertionSort(int num[]){
        for(int i=1; i<num.length; i++){
            int curr = num[i];
            int prev = i-1;
            // finding correct position
            while(prev >=0 && num[prev]> curr){
                num[prev+1] = num[prev];
                prev --;
            }
            //insertion
            num[prev+1]= curr;
        }
        for(int i=0; i<=num.length-1; i++){
            System.out.print(num[i]+", ");
        }
    }
    public static void main(String[] args) {
        int numbers[] = {5,4,1,3,2};
        insertionSort(numbers);
    }
}
