package dp.level2;

// leetcode 40 
// also called target sum / combination 2
public class subset {
    public static void main(String[] args) {
        // int a[] ={1,2,7,8,10};
        // int target = 10;
        int a[] ={10,1,2,7,6,1,5};
        int target = 8;
        System.out.println("no of ways = "+ways(a, target, a.length, ""));
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
