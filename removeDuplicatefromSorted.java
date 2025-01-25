import java.util.*;
public class removeDuplicatefromSorted{

    public static void remoDuplicate(ArrayList<Integer>nums){
        for (int i = nums.size() - 1; i > 0; i--) {
            if (nums.get(i) == (nums.get(i - 1))) {
                nums.remove(i);
            }
        }
        System.out.println(nums);
    }
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<Integer>();

        //add elements
        arr.add(10);
        arr.add(10);
        arr.add(20);
        arr.add(20);
        arr.add(30);
        

        System.out.println("Result:");

        remoDuplicate(arr);
    }
}