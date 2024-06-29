// Code to calc max sum of a sub array using kadane's algo
// Time complexity is O(n)
//replace -ve with 0 ----> Kadane's Algo.

public class max_min_subarray03 {
    public static void kadane(int num[]){
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;

        for(int i=0; i<num.length;i++){
            curr_sum = curr_sum + num[i];

            if(curr_sum<0){ // If current sum is less than zero it gives zero to current sum.
                curr_sum =0;
            }
            if(curr_sum > max_sum){     // max sum gets updated
                max_sum = curr_sum;
            }
        }
        System.out.println("Our max sum is : "+max_sum);
    }
    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(numbers);
    }
}
