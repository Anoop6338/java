import java.util.ArrayList;
//leetcode 1823
public class JosephusProblem {

    public static void main(String[] args) {
        System.out.println(sol(7, 3));
    }

    static int sol(int n , int k){

        if(n==1){       //corner case if there is only 1 number.
            return n;
        }


        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1; i<=n; i++){
            al.add(i);
        }

        int i=-1;
        while(true){
            i=(i+k)%al.size();
            al.remove(i);
            if(al.size()==1){
                break;
            }
            else{
                i=i-1;
            }
        }

        return al.get(0);
    }
}