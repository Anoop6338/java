package recursion.level2;

// leetcode 22
public class balanced_bracket {
    public static void main(String[] args) {
        int n = 3;
        brackets(n);
        // generateParenthesis(n);
        
    }


    static void brackets(int n) {
        results(n, n, "");

    }

    static void results(int open, int close, String ans) {
        if (open == 0 && close == 0) {
            System.out.println(ans);
        } else {
            // use of open bracket
            if (open > 0) {
                results(open - 1, close, ans + " ( ");

            }

            // use of close bracket
            if (open < close) {
                results(open, close - 1, ans + " ) ");

            }
        }
    }



/*  
// leetcode 22
    static List<String> generateParenthesis(int n) {
        ArrayList <String> al = new ArrayList<>();
        results(n, n, "", al);
        System.out.println(al);
        return al;

    }

    static void results(int open, int close, String ans, ArrayList<String> al) {
        if (open == 0 && close == 0) {
            al.add(ans);
        } else {
            // use of open bracket
            if (open > 0) {
                results(open - 1, close, ans + " ( ", al);

            }

            // use of close bracket
            if (open < close) {
                results(open, close - 1, ans + " ) ", al);

            }
        }
    }
*/
}
