import java.util.Arrays;

public class multiple_missing_num {

    static void Missing_Num(int arr[], int n){
        boolean missed[]= new boolean[n+1];

        for(int i =0; i<arr.length; i++){
            int target = arr[i];
            missed[target]= true;
        }
        System.out.println(Arrays.toString(missed));
        
        System.out.println("Missing numbers are: ");
        for(int i =1; i<missed.length; i++){
            if(missed[i]==false){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,5,6,7,8,10,11,12,13,14,15,16,18,19,20};
        int total = 20;
        Missing_Num(nums,total);
    }
}