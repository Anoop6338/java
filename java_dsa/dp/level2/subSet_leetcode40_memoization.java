package dp.level2;

import java.util.*;
// leetcode 40 
// also called target sum / combination 2
public class subSet_leetcode40_memoization {
    public static void main(String[] args) {
        int a[] ={10,1,2,7,6,1,5};
        int target = 8;
        combinationSum2(a, target);
    }

    static String dp[][];
    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int n = candidates.length;
        dp = new String[target+1][n+1];

        // for(int i=0;i<dp.length; i++){
        //     Arrays.fill(dp[i], "-1");
        // }

        List<List<Integer>> mainList = new ArrayList<>();
        ways(candidates, target, candidates.length, "" , mainList);

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j] +"\t");
            }
            System.out.println();
        }


        System.out.println("Resulting Combinations:");
        for (List<Integer> list : mainList) {
            System.out.println(list);
        }


        return mainList;
    }

    static String ways(int a[], int target, int n, String ans, List<List<Integer>> mainList){
        if(target == 0 ){
            // System.out.println(ans);
            List<Integer> al = new ArrayList<>();
            al = stringTokenizer(ans);
            if(checkDuplicate(al, mainList)){
                mainList.add(al);
                System.out.println(al);
            }
            return dp[0][n] = ans;
        }

        else if(n==0){
            return dp[target][0] = "";
        }
        else{
            if(dp[target][n] != null){      // if already in dp[][]
                return dp[target][n];
            }
            else{
                int index = n-1;
                String ans1 = "", ans2 = "";
                if(target - a[index] >= 0){
                    ans1 =  ways(a, target- a[index], n-1, ans+a[index]+" ", mainList);
                    
                }
                ans2 = ways(a, target, n-1,ans,mainList);
    
                return dp[target][n] = ans1+ans2;
            }
        }
    }


    static List<Integer> stringTokenizer(String s){
        List<Integer> al = new ArrayList<>();

        s=s.trim();
        StringTokenizer st = new StringTokenizer(s);
        int count = st.countTokens();

        for(int i=0 ; i<count; i++){
            int num = Integer.parseInt(st.nextToken());
            al.add(num);
        }

        return al;
    }



    static boolean checkDuplicate(List<Integer> al, List<List<Integer>> mainList){
        Collections.sort(al);

        for (List<Integer> list : mainList) {
            // Create a copy of the current list in mainList and sort it
            List<Integer> sortedList = new ArrayList<>(list);
            Collections.sort(sortedList);

            // Compare the sorted versions of the lists
            if (al.equals(sortedList)) {
                System.out.println("Duplicate found: " + al);
                return false;
            }
        }

        return true;

    }
}

