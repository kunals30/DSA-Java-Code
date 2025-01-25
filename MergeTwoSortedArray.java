import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 4, 5};
        int[] res = new int[arr1.length + arr2.length];
        int i = 0, j = 0, iter = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[iter++] = arr1[i++];
            } else if (arr1[i] == arr2[j]) {
                res[iter++] = arr1[i++];
                res[iter++] = arr2[j++];
            } else {
                res[iter++] = arr2[j++];
            }
        }

        // Add remaining elements of arr1
        while (i < arr1.length) {
            res[iter++] = arr1[i++];
        }

        // Add remaining elements of arr2
        while (j < arr2.length) {
            res[iter++] = arr2[j++];
        }

        System.out.println(Arrays.toString(res));
    }
}
