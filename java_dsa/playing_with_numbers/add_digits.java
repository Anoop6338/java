package playing_with_numbers;
// leetcode 258
public class add_digits {
    public static void main(String[] args) {
        int num =38;
        System.out.println(addDigits(num));
    }

    static int addDigits(int num) {
        while(num>=10){
            int new_num = 0;
            while(num>=1){
                int d = num%10;
                num = num/10;
                new_num += d;
            }
            num = new_num;
        }
        return num;
    }
}
