package dp.level2;

import java.util.*;
// leetcode 39
public class combination_sum2_memoization {
    public static void main(String[] args) {
        int a[] ={10,1,2,7,6,1,5};
        int target = 8;
        combinationSum2(a, target);
    }


    static List<Integer> dp[][];
    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int n = candidates.length;

        dp = new List[target+1][n+1];
        // for(int i=0; i<dp.length; i++){
        //     Arrays.fill(dp[i], -1);
        // }

        List<List<Integer>> mainList = new ArrayList<>();
        List<Integer> al = new ArrayList<>();

        ways(target, n , candidates, mainList, al);

        for(List<Integer> i : mainList){
            System.out.println(i);
        }

        return mainList;
    }

    static void ways(int target, int n, int candidates[], List<List<Integer>> mainList, List<Integer> al ){
        if(target==0){
            if(!mainList.contains(al)){
                mainList.add(new ArrayList<>(al));
                dp[0][n] = al;
            }
        }
        else if(n==0){
            //do nothing
            
        }
        else{
            if(dp[target][n]!=-1){
                return dp[target][n];
            }
            int index = n-1;
            if(target - candidates[index] >= 0){
                al.add(candidates[index]);      // add the included candidate   for "Include branch"

                ways(target - candidates[index], n-1, candidates, mainList, al);

                al.remove(al.size()-1);     // remove the last included candidate for "Don't Included branch"
            }
            while(index>0 && candidates[index]==candidates[index-1]){
                index--;
            }

            ways(target, n-1, candidates, mainList, al);

        }
    }
}
