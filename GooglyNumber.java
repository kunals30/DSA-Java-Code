
import java.util.*;

public class GooglyNumber{

    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        if(num == 2){
            return true;
        }
        if(num % 2 == 0){
            return false;
        }

        for(int i=3; i<=Math.sqrt(num); i+=2){
            if(num % 1 == 0){
                return false;
            }
        }
        return true;
    }

    public static String isGooglyPrime(int N){
        int sumOfDigits = 0;
        int temp = N;

        while(temp>0){
            sumOfDigits += temp % 10;
            temp /= 10;
        }

        if(isPrime(sumOfDigits)){
            return "Yes";
        }else{
            return "No";
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}