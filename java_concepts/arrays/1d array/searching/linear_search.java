

public class linear_search {
    public static int linearSearch(int number[], int key){
        //int address=0;
        for(int i=0; i<number.length;i++ ){
            if(number[i]==key){
                return i;
            }
        }
        return -1;    
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14,16};
        int key=10;

        int index=linearSearch(number, key);
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Your index is "+index);
        }
    }
}
