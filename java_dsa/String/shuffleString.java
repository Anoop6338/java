package String;

// leetcode 1528
public class shuffleString {
    public static void main(String[] args) {
        String s = "codeleet" ;
        int [] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }

    static String restoreString(String s, int[] indices) {
        char output[] = new char[indices.length];
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            int pos = indices[i];
            output[pos] = ch;
        }
        // String s2="";
        // for(int i=0; i<output.length;i++){
        //     s2=s2+output[i];
        // }
        // System.out.println(s2);
        // return s2;

        return String.valueOf(output);
    }
}
