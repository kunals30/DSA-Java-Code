import java.util.ArrayList;
import java.util.Collections;

public class largestElement{

    public static int largest(ArrayList<Integer>nums){
        int largest = nums.get(0);
        for(int i: nums){
            if(i > largest ){
                largest  = i;
            }
        }
        return largest;
    };

    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();

        arr.add(6);
        arr.add(8);
        arr.add(12);
        arr.add(65);
        arr.add(87);
        arr.add(34);
        arr.add(90);
        arr.add(124);
        arr.add(53);

        System.out.println("Largest element :");
        System.out.println(largest(arr));
        System.out.println(Collections.max(arr));

        // Second Largest element

        

    }
}