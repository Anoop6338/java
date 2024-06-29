package recursion.level2;

public class Target_sum_or_not {
    public static void main(String[] args) {
        int a[]={10,20,5,15,30};
        int target = 30;
        System.out.println(ways(a, target));
    }


    static boolean ways(int a[], int target){
       
        return checkSum(a, target, 0, "");
    }

    static boolean checkSum(int a[], int target,int i, String ans){
        if(i==a.length){
            if(target==0){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            /*

            //pick
            boolean ans1 = checkSum(a, target-a[i], i+1, ans+a[i]+" ");

            //don't pick
            boolean ans2 = checkSum(a, target, i+1, ans);

            return ans1||ans2;

            */


            
            // shortcut as if 1st branch is true, 2nd branch will not be created
            // hence extra branches are not created
            return checkSum(a, target-a[i], i+1, ans+a[i]+" ")  ||  checkSum(a, target, i+1, ans);
            

        }
    }
}
