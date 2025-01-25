
public class MaxElement{

    public static int maxEle(int arr[]){
        int result = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i]>result){
                result = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,1,7,4,9,3};

        int maxElement = maxEle(arr);

        System.err.println("Max Element:"+ maxElement);


    }
}