//print all the subarrays of an array
// a subarray is a continuos part of an array
// no element should be skipped
// find sum of all the subarrays
// now find min and max subarray----- Just compare the current sum with Max sum and Min sum

public class subarray {
    public static void sub_arrays(int num[]){
        int ts= 0;   //total subarray
        int max_Sum = Integer.MIN_VALUE;
        int min_Sum = Integer.MAX_VALUE;

        for(int start=0; start<num.length; start++){

            for(int end=start; end<num.length; end++){

                int Curr_Sum=0;  //initializing 
                for(int i=start; i<=end; i++){
                    Curr_Sum +=num[i];
                    System.out.print(num[i]+",");   
                }
                System.out.print(" ->  sum is : "+Curr_Sum);
                
                //comparing the current sum with max_Sum
                if(max_Sum < Curr_Sum){
                    max_Sum = Curr_Sum;
                }
                //comparing the current sum with min_Sum
                if(min_Sum > Curr_Sum){
                    min_Sum = Curr_Sum;
                }

                ts++;
                System.out.println();
            }
            System.out.println();
    }
    System.out.println("total number of subarrays are: "+ts);
    System.out.println("Max SubArray is : "+max_Sum);
    System.out.println("Min SubArray is : "+min_Sum);

}
        
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        sub_arrays(numbers);
    }
}

//brute force method cuz time complexity = O(n^3)