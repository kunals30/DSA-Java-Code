import java.util.*;

public class CountOccurence{
    public static Map<Integer, Integer> countOccurences(int[] arr){

        HashMap<Integer, Integer> countMap = new HashMap<>();

        for(int num: arr){
            if(countMap.containsKey(num)){
                countMap.put(num, countMap.get(num) + 1);
            }else{
                countMap.put(num, 1);
            }
        }
        return countMap;
    }

    public static void main(String[] args) {
         int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
        Map<Integer, Integer> result = countOccurences(arr);
        
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " time(s).");
        }
    }
}