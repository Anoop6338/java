package String;

import java.util.Arrays;

// 3194. Minimum Average of Smallest and Largest Elements
public class leetcode3194 {
    public static void main(String[] args) {
        int num[] = {7,8,3,4,15,13,4,1};
        System.out.println(minAvg(num));
    }

    static double minAvg(int nums[]){           // best and short way
        Arrays.sort(nums);
        int l = nums.length;
        double min = Double.MAX_VALUE;
        for(int i=0;i<l/2;i++){
            int sum = nums[i]+ nums[l-1-i];
            double avg = (float)sum/2;
            min = Math.min(min,avg);
        }
        return min;
    }


    static double minimumAverage(int[] nums) {      // long way
        double avg[] = new double[nums.length/2];
        for(int i=0;i<nums.length/2;i++){

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int index_i=-1;   // faltu h yeh .. sirf naam ka intialize kra h so as nums[index_i and j] chl ske
            int index_j=-1;      
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=-1){
                    if(nums[j]>max){
                        max = nums[j];
                        index_i = j;
                    }
    
                    if(nums[j]<min){
                        min = nums[j];
                        index_j =j;
                    }
                }
            }
            
            nums[index_i]=-1;
            nums[index_j]=-1;
            
            // System.out.println(Arrays.toString(nums));            
            double average = (float)(max+min)/2;
            avg[i]= average;
            // System.out.println(Arrays.toString(avg));
        }
        double min_avg = Double.MAX_VALUE;
        for(int i=0;i<avg.length;i++){
            if(avg[i]<min_avg){
                min_avg = avg[i];
            }
        }
        return min_avg;
    }
}
