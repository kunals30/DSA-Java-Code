
public class SecondLargestElement{
    public static void main(String[] args) {

        int[] arr = {5,3,6,2,8,6,9};
        int Largest = arr[0];
        int SecondLargest = 0;

        for(int i=1; i<arr.length; i++){
            if(arr[i]>Largest){
                SecondLargest = Largest;
                Largest = arr[i];
            }
        }

        System.out.println("Second Largest Element:"+ SecondLargest);

        
    }
}