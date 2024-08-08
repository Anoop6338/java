package arrays;
// leetcode 1732
public class highest_altitude {
    public static void main(String[] args) {
        int gain[] = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }

    static int largestAltitude(int[] gain) {
        int max = 0;
        int pos = 0;
        for(int i =0; i<gain.length; i++){
            pos = pos+ gain[i];
            if(pos>max){
                max = pos;
            }
        }
        return max;
    }
}
