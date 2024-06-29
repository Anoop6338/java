public class Counting_sort {
    public static void countingSort(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){    // finding largest value
            largest = Math.max(largest, num[i]);
        }

        int count[] = new int[largest+1];   // 0 is also included.
        for(int i=0; i<num.length; i++){
            count[num[i]]++;    // we have taken number as index and increased the number by 1 in count array.

        }
        // sorting
        int j=0;
        for(int i=0; i<count.length;i++){
            while(count[i]>0){
                num[j]=i;   // storing i on the jth index of num array
                j++;    // index of original num array increased
                count[i]--; //frequency decreased by 1
            }
        }
        //printing of num array
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+", ");
        }
    }
    public static void main(String[] args) {
        int numbers[]={1,4,1,3,2,4,3,7};
        countingSort(numbers);
    }
}
