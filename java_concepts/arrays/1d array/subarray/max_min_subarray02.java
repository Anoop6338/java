//Finding max and min sum of Sub Array using prefix array method.
//Time complexity is  O(n^2).
// Formula for sum is   if(start==0){sum= prefix[end]}
//                      else   sum= prefix[end]-prefix[start-1]

public class max_min_subarray02 {
    public static void SubArray(int num[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum=0;

        int prefix[]= new int[num.length];  //declaring prefix array

        prefix[0]=num[0];
        for(int i =1; i<prefix.length; i++){    //insertion into the prefix
            prefix[i]=prefix[i-1]+ num[i];
        }

        for(int i=0; i<num.length; i++){
            
            for(int j=i; j<num.length; j++ ){
                if(i==0){
                    sum = prefix[j];
                }
                else{
                    sum = prefix[j]-prefix[i-1];
                }
                
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

