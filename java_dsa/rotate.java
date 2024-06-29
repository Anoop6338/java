import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        int num[] = {10,20,30,40,50,60,70,80,90,100};
        int target = 3;
        rotatedArray(num, target);
    }

//method 1

    static void rotatedArray(int arr[], int k){
        Integer newArr[] = new Integer[arr.length];
        int l=0;
        for(int i = arr.length-1; i>arr.length-1-k; i--){
            newArr[l+k-1]= arr[i];
            l--;
        }
        System.out.println(Arrays.toString(newArr));

        for(int i = 0; i<=arr.length-1-k; i++){
            newArr[i+k]= arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }

// method 2:

    // public static void rotatedArray(int[] nums, int k) {
    //     int n = nums.length;
    //     reverseNum(nums,0,n-1);
    //     reverseNum(nums,0,k-1);
    //     reverseNum(nums,k,n-1);
    // }
    // public static void reverseNum(int[] nums, int start, int end) {
    //     while(start < end) {
    //         int temp = nums[start];
    //         nums[start] = nums[end];
    //         nums[end] = temp;
    //         start++;
    //         end--;
    //     }
    // }

}
