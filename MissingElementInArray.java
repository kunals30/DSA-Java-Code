//Array is consecutive

public class MissingElementInArray{

    public static int missingElement(int[] arr){
        int numAddition = 0;
        int arrAddition = 0;

        //Original Array = [1,2,3,4,5] = 15
        //Original Array = [3,4,5,6,7] = 15

        //Input Array = [1,2,3,5] = 11
        //Input Array = [3,4,5,7] = 11

        for(int i=arr[0]; i<=arr[arr.length-1]; i++){
            numAddition += i;
        }

        for(int i = 0; i<arr.length; i++){
            arrAddition += arr[i];
        }

        int result = numAddition - arrAddition;

        return result;
    }


    public static void main(String[] args) {
        int[] arr = {3,4,5,7};

        int MissingElement = missingElement(arr);

        System.out.println(MissingElement);
    }
}