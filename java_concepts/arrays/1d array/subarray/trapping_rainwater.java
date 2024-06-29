/*
 * calc left max boundar - array
 * calc right max boundary - array
 * 
 * loop
 * water level = min(ledt max boundary, right max boundary)
 * trapped water = (waterlevel - height[i]) * width
 */

public class trapping_rainwater {
    public static void TrappedRainWater(int num[]) {
        int n = num.length;
        int width = 1; // width of each bar.... mostly 1

        // calculate left max boundary
        int left_max[] = new int[n]; // declaring auxilary array for left boundary
        left_max[0] = num[0];
        for (int i = 1; i < n; i++) {
            left_max[i] = Math.max(left_max[i - 1], num[i]); // storing values in array
        }

        // // optional to check the left max boundary
        // System.out.print("Left max boundary is:  ");
        // for (int j = 0; j < n; j++) {
        //     System.out.print(left_max[j] + ", ");
        // }
        // System.out.println();

        // calculate right max boundary
        int right_max[] = new int[n]; // declaring auxilary array for right boundary
        right_max[n - 1] = num[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right_max[i] = Math.max(right_max[i + 1], num[i]); // storing values in array
        }

        // // optional to check the right max boundary
        // System.out.print("Right max boundary is: ");
        // for (int j = 0; j < n; j++) {
        //     System.out.print(right_max[j] + ", ");
        // }
        // System.out.println();

        // loop for final caslculation
        int trapped_water = 0;
        for (int i = 0; i < n; i++) {
            int water_level = Math.min(left_max[i], right_max[i]);
            trapped_water += ((water_level - num[i]) * width);
            
        }
        System.out.println("Final trapped water inside : " + trapped_water);
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        TrappedRainWater(height);
    }
}

/*
  Its time complexity is O(n) ---> This is because the number of time the code is running
  is directly proportional to the number of bars/smount of numbers given in the array.
 */