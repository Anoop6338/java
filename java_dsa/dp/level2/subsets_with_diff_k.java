package dp.level2;

import java.util.Arrays;

// gfg -  https://www.geeksforgeeks.org/count-of-subsets-with-given-difference/
public class subsets_with_diff_k {
    public static void main(String[] args) {
        // int num[] = {1,5,2,2,7};
        int num[] = {1,2,3,1,2};
        int k=3;
        System.out.println(subset(num, k));
        
    }

    static int subset(int num[], int k){
        int total = Arrays.stream(num).sum();   // inbuilt function to calculate sum of array

//  no of ways of subset1 = no of ways of subset2 = no of subsets possible

        int subset1 = (total+k)/2;      
        // int subset2 = (total-k)/2;               // no need of this   

        return ways(num, subset1, num.length, "");
    }

    static int ways(int a[], int target, int n, String ans){
        if(target == 0 ){       // we have reached the target
            System.out.println(ans);
            return 1;
        }
        else if(n==0){      // numbers in a[] is finished
            // System.out.println("X");
            return 0;
        }
        else{
            int index = n-1;
            int ans1 =0, ans2=0;
            if(target - a[index] >= 0){
                ans1 =  ways(a, target- a[index], n-1, ans+a[index]+" ");
           
            }
            ans2 = ways(a, target, n-1, ans);

            return ans1+ans2;
        }
    }
}
