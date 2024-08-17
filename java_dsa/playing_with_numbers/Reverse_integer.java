package playing_with_numbers;
// leetcode 7
public class Reverse_integer {
    public static void main(String[] args) {
        int num = 1534236469;
        System.out.println(reverse(num));
    }

    static int reverse(int num) {
        if(num < Integer.MAX_VALUE && num > Integer.MIN_VALUE){
            boolean isNegative = false;
            if(num<0){
                isNegative = true;
            }

            num = Math.abs(num);
            StringBuffer sb = new StringBuffer(Integer.toString(num));
            sb.reverse();
            String s = sb.toString();
            if(Long.valueOf(s) >  Integer.MAX_VALUE  || Long.valueOf(s) < Integer.MIN_VALUE){
                return 0;
            }
            
            int ans = Integer.parseInt(s);
            
            if(isNegative){
                ans = -ans;
            }
            return ans;
        }
        else{
            return 0; 
        }
    }
}
