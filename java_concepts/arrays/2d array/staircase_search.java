

public class staircase_search {
    public static void StaircaseSearch(int num[][],int key){
        //Using upper secondary diagonal element as no.
    /* 
        int row=0;
        int col = num[0].length-1;

        while(row < num.length && col>=0){
            if(num[row][col]==key){
                System.out.println("Key found at ("+row+","+col+")");
                return;
            }
            else if(key < num[row][col]){
                col--;
            }
            else if(key > num[row][col]){
                row++;
            }
        }
        System.out.println("Not found");
    */
        //Using lower secondary diagonal element as no.

        int row = num.length-1;
        int col = 0;

        while(col < num[0].length && row >=0){
            if(num[row][col]== key){
                System.out.println("Key found at ("+row+","+col+")");
                return;
            }
            else if(key<num[row][col]){
                row--;
            }
            else if(key>num[row][col]){
                col++;
            }
        }
        System.out.println("Key not found");
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}};
        StaircaseSearch(matrix, 33);
    }
}
