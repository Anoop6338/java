import java.util.ArrayList;

public class list_of_list {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(34);
        al1.add(558);
        al1.add(64);
        System.out.println(al1);

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(354);
        al2.add(58);
        al2.add(664);
        System.out.println(al2);


        ArrayList<Integer> al3 = new ArrayList<>();
        al3.add(3984);
        al3.add(58);
        al3.add(664);
        System.out.println(al3);


        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        main.add(al1);
        main.add(al2);
        main.add(al3);
        System.out.println(main);

    }
}
