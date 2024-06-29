package matrix;
// not completed
import java.util.ArrayList;
import java.util.List;

public class lucky_number {
    public static List<Integer> luckyNumbers (int[][] a) {
        List<Integer> al = new ArrayList<>();
        int min, max;
        int temp_j =0;

        for(int i=0; i<a.length ;i++){
            min =a[i][0];
            for(int j=0; j<a[0].length; j++){
                if(a[i][j]<min){
                    min = a[i][j];
                    temp_j=j;
                }
            }
            
            max = min;
            for(int k =0; k<a.length; k++){
                if(a[k][temp_j]>max){
                    max = a[k][temp_j];
                }
            }
            if(min == max){
                al.add(max);
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int a[][] ={{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(a));

    }
}
