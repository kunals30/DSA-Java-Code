import java.util.*;
public class moveToEnd{

    public static void endMove(ArrayList<Integer>nums){
        int count = 0;
        for(int i = nums.size()-1; i>=0; i--){
            if(nums.get(i)==0){
                nums.remove(i);
                count++;
            }
        }
        for(int i=1; i<= count ;i++){
            nums.add(0);
        }

        System.out.println(nums);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();


        arr.add(6);
        arr.add(0);
        arr.add(12);
        arr.add(0);
        arr.add(0);
        arr.add(34);
        arr.add(90);
        arr.add(0);
        arr.add(53);

        endMove(arr);

    }
}