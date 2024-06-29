package recursion.level2;

public class generate_anagrams {
    public static void main(String[] args) {
        String s ="ABCD";
        anagrams(s);
    }

    static void anagrams(String s){
        int count[] ={0};
        combinations(s,"", count);
        System.out.println(count[0]);
    }

    static void combinations(String s, String ans, int count[]){
        if(s.equals("")){
            System.out.println(ans);
            count[0]++;
        }
        else{
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
            String rem = s.substring(0, i) + s.substring(i+1);

            combinations(rem, ans+ch,count);
            }
        }
    }
}
