package dp.level2.matrix_dp;

import java.util.Arrays;

// leetcode 733
// not a dp ques
public class flood_fill {
    public static void main(String[] args) {
        int image[][] = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        
        floodFill(image, sr, sc, color);

    }

    static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int old_color = image[sr][sc];
        ways(image, sr, sc, color, old_color);

        for(int i=0; i<image.length; i++){
            System.out.println(Arrays.toString(image[i]));
        }
        return image;
    }

    static void ways(int[][] image, int sr, int sc, int new_color, int old_color){
        if(image[sr][sc] == new_color){
            // do nothing
        }
        else{
            
            if(image[sr][sc] == old_color){
                image[sr][sc] = new_color;
                // go up
                if(sr-1 >=0){
                    ways(image, sr-1, sc, new_color,old_color);
                }

                // go down
                if(sr+1 <= image.length-1){
                    ways(image, sr+1, sc, new_color, old_color);
                }

                // go left
                if(sc-1 >=0){
                    ways(image, sr, sc-1, new_color, old_color);
                }

                // go right
                if(sc+1 <= image[0].length-1){
                    ways(image, sr, sc+1, new_color, old_color);
                }
            }
            else{
                // do nothing
            }
        }
    }
    
}