public class palindrome_check {
    public static void main(String[] args) {
        int num[] ={10,20,30,30,20,10};
        System.out.println(palindrome(num));

    }
    static boolean palindrome(int arr[]){ 
        int i= 0;
        int j = arr.length-1;
        while( i<  j){
            if( arr[i]!= arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
