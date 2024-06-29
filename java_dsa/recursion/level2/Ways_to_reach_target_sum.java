package recursion.level2;


public class Ways_to_reach_target_sum {
    public static void main(String[] args) {
        int a[]={10,20,5,15,30};
        int target = 30;
        ways(a, target);
    }


    static void ways(int a[], int target){
        System.out.println("method 1");
        result(a, target, 0, 0, "");

        System.out.println("method 2");
        result_method2(a, target, 0, "");


        int count[]={0};
        System.out.println("Number of tail ways = "+counting_tail(a,target,0,"",count));

        System.out.println("number of head ways = "+counting_head(a, target,0, ""));
    }


    static void result(int a[], int target, int i, int sum, String ans){
        if(i==a.length){
            if(sum==target){
                System.out.println(ans);
            }
            else{
                // System.out.println("x");
            }
        }
        else{
            //pick
            result(a, target, i+1, sum+a[i], ans+a[i]+" ");

            //don't pick
            result(a, target, i+1, sum, ans);
        }
    }


    static void result_method2(int a[], int target, int i, String ans){  // not using sum parameter
        if(i==a.length){
            if(target==0){      // if target is zero means our answer is there
                System.out.println(ans);
            }
            else{
                // System.out.println("x");
            }
        }
        else{
            //pick
            result_method2(a, target-a[i], i+1, ans+a[i]+" ");  // reducing the number from target

            //don't pick
            result_method2(a, target, i+1, ans);
        }
    }


    static int counting_tail(int a[], int target, int i, String ans, int count[]){  // not using sum parameter and using call by reference data type
        if(i==a.length){
            if(target==0){      // if target is zero means our answer is there
                count[0]++;
            }
            else{
                // System.out.println("x");
            }
        }
        else{
            //pick
            counting_tail(a, target-a[i], i+1, ans+a[i]+" ", count);  // reducing the number from target

            //don't pick
            counting_tail(a, target, i+1, ans, count);
        }
        return count[0];
    }



    static int counting_head(int a[], int target, int i, String ans){  // not using call by reference data type
        if(i==a.length){
            if(target==0){      // if target is zero means our answer is there
                return 1;
            }
            else{
                // System.out.println("x");
                return 0;
            }
        }
        else{
            //pick
            int ans1= counting_head(a, target-a[i], i+1, ans+a[i]+" ");  // reducing the number from target

            //don't pick
            int ans2 =counting_head(a, target, i+1, ans);

            return ans1+ans2;
        }
    }


    

    
}