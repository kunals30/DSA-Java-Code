
    public class MissingNumber{
        public static void main(String[] args){
            int[] arr = {1,2,3,4,5,7,8,9};
            int n =arr.length; 
            int start = arr[0];
            int end = arr[n-1];
            int actualSum = 0;

            int initialCal = ((start-1)*(start))/2;
            int finalCal = (end*(end+1))/2;

            for(int i=0; i<n; i++){
                actualSum += arr[i];
            }

            int theMisssingElement = (finalCal - initialCal) - actualSum;

            System.out.println("The missing element:"+ theMisssingElement);

            
        }
    }