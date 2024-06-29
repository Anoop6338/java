package recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int a[] ={12,8,7,6,4,3,1};
        int num = 6;
        search_tail(a, num, a.length-1);

        System.out.println(search_head(a, num, a.length-1));
        
    }

    static void search_tail(int a[], int num, int i){
        if(i==-1){
            System.out.println("Not found");
        }
        else if(a[i]==num){
            System.out.println("found at "+i);
        }
        else{
            search_tail(a, num, i-1);
        }
    }

    static int search_head(int a[], int num, int i){
        if(i==-1){
            return -1;
        }
        else if(a[i]==num){
            return i;
        }
        else{
            return search_head(a, num, i-1);
        }
    }
}
