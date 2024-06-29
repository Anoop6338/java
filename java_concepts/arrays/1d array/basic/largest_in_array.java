// find max and min number in an array
public class largest_in_array {
    public static int max_and_min(int num[]){
        int max = Integer.MIN_VALUE;  // -infinity
        int min = Integer.MAX_VALUE;  // +infinity

        for(int i=0; i<num.length; i++){
            if(max<num[i]){
                max =num[i];
            }
            if(min>num[i]){
                min = num[i];
            }
        }
        System.out.println("max value is : "+ max );
        System.out.println("min value is : "+min);
        return 0;
    }
    public static void main(String[] args) {
        int numbers[]= {1,2,6,2,8,3};

        max_and_min(numbers);
    }
}
