package String;
//leetcode 28

public class lonestCommonChars {
    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        System.out.println("answer "+longestCommonPrefix(strs));
    }

    static String longestCommonPrefix(String[] strs) {
        int l=Integer.MAX_VALUE;
        
        int total_strs = strs.length;
        for(int i=0;i<total_strs;i++){
            if (strs[i].length()<l){
                l=strs[i].length();
            }
        }
        // System.out.println(l);

        int i=0;
        int j;
        String output ="";
        while(i<l){
            for( j=0; j<total_strs-1; j++){
                if(strs[j].charAt(i)!=strs[j+1].charAt(i)){
                    return output;
                }
            }
            output = output+ strs[j].charAt(i);
            // System.out.println(output);
            i++;
        }
        return output;
    }
}
