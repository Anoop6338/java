import java.util.Arrays;        // for ascending order
import java.util.Collections;    // for decending order

public class Inbuilt_sort {
    public static void main(String[] args) {
        //int numbers[] = {5,4,1,3,2};
        //Arrays.sort(numbers); // sorts the whole array
        //Arrays.sort(numbers, 0, 3); // sorts the array from and to the index given
        
        //to sort in decending order
        Integer numbers[] = {5,4,1,3,2};    // we need to replace int with Integer as Collection works on objects. It doesn't work on primitive data type.
        //Arrays.sort(numbers, Collections.reverseOrder()); // sorts the whole array in decending order
        Arrays.sort(numbers, 0, 3, Collections.reverseOrder()); // sorts the array from and to the index given in decending order
        
        
        
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]+", ");
        }
    }
}
