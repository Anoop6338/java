package dp.level2.unbounded_knapsack;

import java.util.*;

//leetocde 39
public class combination_sum {
    public static void main(String[] args) {
        int target = 8;
        int candidates[] ={2,5,3};
        combinationSum(candidates, target);
    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> mainList = new ArrayList<>();
        List<Integer> al = new ArrayList<>();

        ways_withoutStringATokenizer(target, n, candidates, mainList,al);

        for(List<Integer> i : mainList){
            System.out.println(i);
        }

        return mainList;
    }

    // without the use of String Tokenizer
    static void ways_withoutStringATokenizer(int target, int n ,int candidates[], List<List<Integer>> mainList, List<Integer> al){
        if(target == 0){
            mainList.add(new ArrayList<>(al));
        }
        else if(n==0){
            // do nothing
        }
        else{
            int index = n-1;
            if(target - candidates[index] >= 0){
                al.add(candidates[index]);  // add the included candidate   for "Include branch"

                ways_withoutStringATokenizer(target-candidates[index], n, candidates, mainList, al);

                al.remove(al.size()-1); // remove the last included candidate for "Don't Included branch"
            }
            ways_withoutStringATokenizer(target, n-1, candidates, mainList, al );
            
        }
    }


/* 
    // use of String Tokenizer
    static void ways(int target, int n ,int candidates[], List<List<Integer>> mainList, String ans){
        if(target == 0){
            System.out.println(ans);
            mainList.add(stringTokenizer(ans));
        }
        else if(n==0){
            // do nothing
        }
        else{
            int index = n-1;
            if(target - candidates[index] >= 0){
                ways(target-candidates[index], n, candidates, mainList, ans + candidates[index] + " ");
            }
            ways(target, n-1, candidates, mainList, ans);
            
        }
    }

    static List<Integer> stringTokenizer( String s){
        List<Integer> al = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(s);
        int count = st.countTokens();

        for(int i=1; i<=count; i++){
            int num = Integer.parseInt(st.nextToken());
            al.add(num);
        }

        return al;
    }

*/

}
