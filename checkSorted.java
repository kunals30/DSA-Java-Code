import java.util.*;
public class checkSorted{

    public static boolean isSorted(ArrayList<Integer>nums){
        for(int i=1 ; i<nums.size(); i++){
            if(nums.get(i) < nums.get(i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(6);
        arr.add(8);
        arr.add(12);
        arr.add(65);
        arr.add(87);
        arr.add(90);
        arr.add(124);

        System.out.println("Result:");
        System.out.println(isSorted(arr));
    }
}