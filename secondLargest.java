import java.util.*;
public class secondLargest{

    public static int secLargest(ArrayList<Integer>nums){
        int largest = nums.get(0);
        int secLargest = nums.get(0);

        for(int i : nums){
            if(i> largest){
                int temp = largest;
                largest = i;
                secLargest = temp;
            }
        }
        return secLargest;
    }

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

        System.out.println("The second largest element:");
        System.out.println(secLargest(arr));


    }
}
