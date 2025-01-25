import java.util.*;

public class reverseArray{

    public static void reversingArr(ArrayList<Integer> nums){
        int high = nums.size()-1;
        int low = 0;

        while(low<high){
            Collections.swap(nums, high,low);
            high--; 
            low++;
        }
        System.out.println(nums);
    }
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<Integer>();

        //add elements
        arr.add(12);
        arr.add(15);
        arr.add(34);
        arr.add(67);
        arr.add(54);

        System.out.println("Result:");

        reversingArr(arr);
        
    }
}