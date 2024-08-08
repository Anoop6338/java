package arrays;

import java.util.Arrays;

public class merge_2_sorted_array {
    public static void main(String[] args) {
        int num1[] = {1,3,6,10,15};
        int num2[] = {2,5,6,8,16};
        System.out.println(Arrays.toString(sorted(num1, num2)));
    }

    static int[] sorted(int num1[] , int num2[]){
        int ans[] = new int[num1.length + num2.length];
        int i = 0, j = 0, k = 0;

        while (i < num1.length && j < num2.length) {
            if (num1[i] < num2[j]) {
                ans[k] = num1[i];
                k++;
                i++;
            } else {
                ans[k] = num2[j];
                k++;
                j++;
            }
        }

        // If num1[] has remaining elements, add them to ans[]
        while (i < num1.length) {
            ans[k] = num1[i];
            k++;
            i++;
        }

        // If num2[] has remaining elements, add them to ans[]
        while (j < num2.length) {
            ans[k] = num2[j];
            k++;
            j++;
        }

        return ans;
    }
}
