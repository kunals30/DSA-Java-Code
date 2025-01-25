
import java.util.ArrayList;

// In sorted Array
public class frequenciesOfElements{

    public static void elementFrequency(ArrayList<Integer> nums){
        int count = 1;
        int i = 1;
        while(i<nums.size()){
            while(i<nums.size() && (nums.get(i) == nums.get(i-1))){
                i++;
                count++;
            }
            System.out.println(count);
            i++;
            count = 1;
        }
        if(nums.size() == 1 || (nums.get(nums.size()-1)!= nums.get(nums.size()-2))){
            System.out.println(1);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(6);
        arr.add(8);
        arr.add(8);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(12);
        arr.add(65);
        arr.add(65);
        arr.add(87);
        arr.add(87);
        arr.add(87);

        elementFrequency(arr);
        
    }
}