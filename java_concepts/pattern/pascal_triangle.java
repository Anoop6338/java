public class pascal_triangle {

    public static void main(String[] args) {
        int num=5;
        for(int row=0; row<num-1; row++){
            for(int i=num-row-1; i>0; i--){
                System.out.print("-");
            }
            System.out.print("1");
            System.out.print("-");
            
            int digit = 1;
            for(int j=0; j<row-1; j++){
                
                System.out.print(digit);
                digit++;
                System.out.print("-");
            }
            if(row>0){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}