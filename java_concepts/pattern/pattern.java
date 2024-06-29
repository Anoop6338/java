public class pattern {
    public static void main(String[] args) {

        Integer n = 4;

        for (int c = 1; c <= n; c++) {
            for (int j = n - c; j > 0; j--) {
                System.out.print("-");
            }

            for (int i = 1; i <= c; i++) {
                System.out.print("*");

            }

            System.out.println();
        }


        System.out.println();
        System.out.println();



        for (int c = 1; c <= n; c++) {
            for (int j = n - c; j > 0; j--) {
                System.out.print("-");
            }

            for (int i = 1; i <= (2 * c - 1); i++) {
                System.out.print("*");

            }

            System.out.println();
        }



        System.out.println();
        System.out.println();



        for (int c = 0; c < n; c++) {

            for (int j = 0; j < c; j++) {
                System.out.print("-");
            }

            for (int i = n - c; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();


        for (int c = 0; c < n; c++) {

            for (int j = 0; j < c; j++) {
                System.out.print("-");
            }

            for (int i = 2 * (n - c - 1); i >= 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
 
    }
}
