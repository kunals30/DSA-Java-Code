import java.util.*;
public class leftRotateByOne{

    public static void leftRotOne(ArrayList<Integer>nums){
        int temp = nums.get(0);

        for(int i =1; i<nums.size(); i++){
            nums.set(i-1, nums.get(i));
        }
        nums.set(nums.size()-1, temp);
        System.out.println(nums);
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);

        leftRotOne(arr);
    }
}