import java.util.*;

class MastQuestion{

    static int QuestionFunction(int arr[], int n, int index){

        if(index == 0){
            return Math.abs(arr[index] - arr[index+1]);
        }
        else if(index == n-1){
            return Math.abs(arr[index] - arr[index-1]);
        }
        else{
            return Math.abs(arr[index] - arr[index+1]) + Math.abs(arr[index] - arr[index-1]);
        }
        };


    public static void main(String[] args) {
        int arr[] = {2,4,1,6,34,8,56,45};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of the given array:");
        int index = sc.nextInt();
        int n = arr.length;

        int result = QuestionFunction(arr, n, index);
        System.out.println("The total sum:"+ result);

    }
}