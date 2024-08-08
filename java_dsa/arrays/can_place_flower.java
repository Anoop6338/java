package arrays;
// leetcode 605
public class can_place_flower {
    public static void main(String[] args) {
        // int flowerbed[] = {1,0,0,0,1};
        int flowerbed[] = {0,0,1,0,1};
        int n =1;

        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l = flowerbed.length;
        if(l==1){
            if(flowerbed[0]==0){
                return true;
            }
            else if(flowerbed[0]==1 && n==0){
                return true;
            }
            return false;
        }

        if(flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0] =1;
            n--;
        }

        if(flowerbed[l-1]==0 && flowerbed[l-2]==0){
            flowerbed[l-1] = 1;
            n--;
        }

        for(int i=1; i<l-1; i++){
            if(flowerbed[i-1]==0 && flowerbed[i]==0 && flowerbed[i+1]==0){
                flowerbed[i] =1;
                n--;
            }
        }

        return n<=0;
    }
}
