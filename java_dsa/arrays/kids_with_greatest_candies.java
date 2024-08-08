package arrays;

import java.util.ArrayList;
import java.util.List;

// leetcode 1431
public class kids_with_greatest_candies {
    public static void main(String[] args) {
        int candies[] ={2,3,5,1,3};
        int extraCandies = 3;

        kidsWithCandies(candies, extraCandies);
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> al = new ArrayList<>();

        int max =0;
        for(int i=0 ; i<candies.length; i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }

        for(int i=0; i<candies.length; i++){
            if(candies[i] + extraCandies >=max){
                al.add(true);
            }
            else{
                al.add(false);
            }
        }

        System.out.println(al);

        return al;
    }
}
