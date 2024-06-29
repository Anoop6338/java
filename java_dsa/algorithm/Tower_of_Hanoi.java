package algorithm;

public class Tower_of_Hanoi {
    public static void main(String[] args) {
        int num = 3;
        int count[]={0};
        move(num, "A", "B", "C", count);
        System.out.println("Number of steps "+count[0]);
    }
    
    static void move(int N, String src, String temp, String dest, int[] count){
        count[0]++;
        if(N==1){
            System.out.println("Move Disc 1 from "+src+" to "+dest);
        }
        else{
            move(N-1, src, dest, temp,count);
            System.out.println("Move disc "+N+" from "+src+" to "+dest);
            move(N-1, temp, src, dest,count);
        }
    }
}
