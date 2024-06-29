

public class arrays_as_arguements {
    public static void update(int marks[]){ //declaring an array
        for(int i=0;i<marks.length;i++){
            marks[i] +=1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,95}; //passing values as arguements in update function.  
        
        update(marks);

        //print marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        
    }
}
