/*
 * Time complexity is O(n^2) as o(n*n-2-i)= o(n*n)
 * Not so good sorting algo
*/

public class bubble_sort {
    public static void BubbleSort(int num[]){
        for(int i=0; i<=num.length; i++){
            // optimized bubble sort... check below for more
            int swap=0;

            for(int j=0; j<=(num.length)-2-i; j++){
                if(num[j]>num[j+1]){
                    int temp = num[j];
                    num[j]=num[j+1];
                    num[j+1]= temp;

                    swap++;
                }  
            }
            if(swap==0){
                break;
            }
        }
        // printing the arranged array
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+", ");
        }
    }
    public static void main(String[] args) {
        int numbers[]= {5, 9, 6, 1, 7, 3, 2};
        BubbleSort(numbers);
    }
}



/*
 * In case if the array paased is sorted already then we can use swap
 * Swap will tell wheter the swapping is done or not.
 * If no swap is done then it waill not check others and return to the outer loop
 * Thus it reduces the time complexity to  O(n)
 */
