package dp.level2;

import java.util.*;
// leetcode 40 
// also called target sum / combination 2
public class subSet_leetcode40 {
    public static void main(String[] args) {
        int a[] ={10,1,2,7,6,1,5};
        int target = 8;
        combinationSum2(a, target);
    }

    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> mainList = new ArrayList<>();
        ways(candidates, target, candidates.length, "" , mainList);

        return mainList;
    }



    static void ways(int a[], int target, int n, String ans, List<List<Integer>> mainList){
        if(target == 0 ){
            // System.out.println(ans);
            List<Integer> al = new ArrayList<>();
            al = stringTokenizer(ans);
            if(checkDuplicate(al, mainList)){
                mainList.add(al);
                System.out.println(al);
            }
        }
        else if(n==0){
            // System.out.println(ans+" --> X");
        }
        else{
            int index = n-1;
            if(target - a[index] >= 0){
                //include
                ways(a, target- a[index], n-1, ans+a[index]+" ", mainList);
                
            }
            // don't include
            ways(a, target, n-1, ans, mainList);
        }
    }

    static List<Integer> stringTokenizer(String s){     // breaks into tokens to add them in the list
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



    static boolean checkDuplicate(List<Integer> al, List<List<Integer>> mainList){      // checking for repeating arraylist 
        Collections.sort(al);

        for (List<Integer> list : mainList) {
            // Create a copy of the current list in mainList and sort it
            List<Integer> sortedList = new ArrayList<>(list);
            Collections.sort(sortedList);

            // Compare the sorted versions of the lists
            if (al.equals(sortedList)) {
                // System.out.println("Duplicate found: " + al);
                return false;
            }
        }

        return true;

    }
}
