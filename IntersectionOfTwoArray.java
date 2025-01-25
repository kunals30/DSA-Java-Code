import java.util.*;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3,4,5};
        int[] arr2 = {4,6,7,8,3,9};
        
        // Create a HashSet and add elements of arr1
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }

        // List to store the intersection result
        ArrayList<Integer> result = new ArrayList<>();

        // Find intersection
        for (int num : arr2) {
            if (set.contains(num)) {
                result.add(num);
                set.remove(num);  // Remove to avoid duplicates in result
            }
        }

        System.out.println("result is:"+ result);

        // Convert the result list to an array (optional)
        int[] resArray = result.stream().mapToInt(i -> i).toArray();

        // Print the result array
        System.out.println("Intersection: " + Arrays.toString(resArray));
    }
}
