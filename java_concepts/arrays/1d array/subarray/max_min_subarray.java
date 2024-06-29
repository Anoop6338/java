// Use of brute force:
// Time complexity is    O(n^2)
//Space complexity is    O(1)

public class max_min_subarray {
    public static void SubArray(int num[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<num.length; i++){
            int sum=0;
            for(int j=i; j<num.length; j++ ){
                sum += num[j];

                if(max<sum){
                    max=sum;
                } 
                if(min>sum){
                    min=sum;
                } 
            }
        }
        System.out.println("max sub array sum is : "+ max);
        System.out.println("min sub array sum is : "+ min);
        
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        SubArray(numbers);
    }
}
