public class binary_search {
    public static int Search(int num[], int key) {

        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisions
            if (num[mid] == key) { // found
                return mid;
            }
            else if (key < num[mid]) { // left
                end = mid - 1;
            }
            else { // right
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 6;
        System.out.println("Index for key : " + Search(numbers, key));
    }
}
