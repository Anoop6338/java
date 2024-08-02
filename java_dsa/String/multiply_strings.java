package String;
// leetcode 43
public class multiply_strings {
    public static void main(String[] args) {
        String num1 = "3";
        String num2 = "2";
        System.out.println(multiply(num1, num2));
    }

    static String multiply(String num1, String num2) {
        Double n1 = Double.parseDouble(num1);
        Double n2 = Double.parseDouble(num2);
        Double sum = n1*n2;
        String output = String.valueOf(sum);
        return output;
    }
}

