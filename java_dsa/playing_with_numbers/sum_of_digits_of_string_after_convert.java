package playing_with_numbers;
// leetcode 1945
public class sum_of_digits_of_string_after_convert {
    public static void main(String[] args) {
        String s ="zbax";
        int k =2;
        System.out.println(getLucky(s, k));
    }

    static int getLucky(String s, int k) {
        String temp ="";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            temp += ch-96;
        }
        System.out.println(temp);

        long num = Long.valueOf(temp);

        for(int i=1; i<=k; i++){
            long new_num = 0;
            while(num>=1){
                long d = num%10;
                num = num/10;
                new_num += d;
            }
            num = new_num;
        }

        return num;
    }
}
