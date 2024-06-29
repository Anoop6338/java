/*
    Time complexity is O(n^2)
 */

public class Selection_sort {
    public static void selectionSort(int num[]){
        for(int i=0; i<=num.length-2; i++){
            int smallest = i;
            
            for(int j=i+1; j<=num.length-1; j++){
                if(num[smallest]>num[j]){
                    smallest = j;
                }
            }
            int temp = num[smallest];
            num[smallest] = num[i];
            num[i]=temp;
        }
        for(int i=0; i<=num.length-1; i++){
            System.out.print(num[i]+", ");
        }
    }
    public static void main(String[] args) {
        int numbers[] ={5,4,1,3,2};
        selectionSort(numbers);
    }
}