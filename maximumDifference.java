import java.util.*;
public class maximumDifference{

    public static void maxDifference(ArrayList<Integer>arr){

        int maxDiff = 0;

        for(int i=0; i<=arr.size()-1; i++){
            for(int j=1; j<arr.size()-1; j++){
                int diff = Math.abs(arr.get(i) - arr.get(j));
                if(diff > maxDiff){
                    maxDiff = diff;
                }                             //1, 10, 2,  14, 15
            }
        }

        System.out.println(maxDiff);


            int max = arr.get(0);
            int min = arr.get(0);

        for(int k =1 ; k<arr.size(); k++){
            if(arr.get(k)> max){
                max = arr.get(k);
            }
            if(arr.get(k)<min){
                min = arr.get(k);
            }

        }
        System.out.println(maxDiff);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

         arr.add(6);
        arr.add(2);
        arr.add(24);
        arr.add(10);
        arr.add(1);

        maxDifference(arr);
    }
}