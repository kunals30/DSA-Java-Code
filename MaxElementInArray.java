import java.util.*;

public class MaxElementInArray{
    public static void main(String[] args){
        Scanner myObj =  new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n = myObj.nextInt();
        int[] array = new int[n]; 
          
        System.out.println("Enter the Elements of array:");

        for(int i=1; i<n; i++){
            array[i] = myObj.nextInt();
        }
        int maxElement = array[0];
        for(int i=1; i<n; i++){
            if(array[i]> maxElement){
                maxElement = array[i]; 
            }
        }

        System.out.println("Max element of array is: " +  maxElement);
    
    }
}