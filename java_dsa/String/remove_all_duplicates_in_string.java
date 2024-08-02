package String;
// leetcode 1047 Remove All Adjacent Duplicates In String
public class remove_all_duplicates_in_string {
    public static void main(String[] args) {
        String s = "aababaab";
        System.out.println(removeDuplicates(s));
    }

    static String removeDuplicates(String s) {
        boolean flag = false;
        while(flag==false){
            System.out.println(s);

            StringBuffer sb = new StringBuffer(s);
            int temp =0;
            for(int i=0; i<sb.length()-1;i++){
                if(sb.charAt(i) == sb.charAt(i+1)){
                    sb.deleteCharAt(i);
                    temp=i;
                    i--;
                    flag = true;
                }
            }
            sb.deleteCharAt(temp);
            s = sb.toString();

            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    flag = false;
                }
            }
            if(flag == true){
                break;
            }
        }
        return s;
    }
}
