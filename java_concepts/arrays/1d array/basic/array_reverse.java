//reversing an array using swapping method which has less space complexity

public class array_reverse {
    public static void reverse(int num[]){
        int first = 0;
        int last =num.length-1;

        while(first<last){
            int temp = num[first];
            num[first] =num[last];
            num[last]= temp;
            first++;
            last--;
        }
        //printing of number
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        
    }
    
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};

        reverse(numbers);
        
    }
}
