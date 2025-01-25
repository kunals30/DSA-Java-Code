import java.util.ArrayList;
public class leadersInAnArray{

    public static void leaderInArray(ArrayList<Integer>nums){
         int curr_leader = nums.get(nums.size()-1);
         System.out.println(curr_leader);


         for(int i=nums.size()-1; i>=0; i--){
            if(curr_leader < nums.get(i)){
                curr_leader = nums.get(i);
                System.out.println(curr_leader);
            }
         }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

         arr.add(6);
        arr.add(2);
        arr.add(24);
        arr.add(10);
        arr.add(2);

        leaderInArray(arr);


    }
}