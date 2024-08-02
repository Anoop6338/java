package String;

public class kochar {
    public static void main(String[] args) {
        int num1[] = {22,33,55};
        int num2[] = {33,11, 44};
        marks(num1, num2);
    }

    static void marks(int num1[], int num2[]){
        int st1=0;
        int st2=0;
        for(int i=0 ;i<num1.length;i++){
            if(num1[i]<num2[i]){
                st2++;
            }
            else if(num1[i]>num2[i]){
                st1++;
            }
            else{
                st1++;
                st2++;
            }
        }

        System.out.println(st1+" ,"+st2);
    }
}
