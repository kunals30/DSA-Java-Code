import java.util.*;

public class IntersectionOfArray{
    public static void main(String[] args) {

        int i=0;
        int j=0;

        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2,3};

        Arrays.sort(num1);
        Arrays.sort(num2);

        ArrayList<Integer>ans = new ArrayList<>();

        while(i<num1.length && j<num2.length){
            if(num1[i] < num2[j]){
                i++;
            }
            else if(num1[i] > num2[j]){
                j++;
            }
            else{
                if(!ans.contains(num1[i])){
                    ans.add(num1[i]);
                }
            }
            i++;
            j++;
        }

        System.out.print("Intersection of Array:"+ans);
    }
}