import java.util.*;

public class binaryToDecimal{

    static int binToDec(int n){
        int result = 0;
        int power = 1;

        while(n>0){
            int lastDigit = n%10;
            if(lastDigit == 1){
                result += lastDigit * power;
            }
            power *= 2;
            n = n/10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int result = binToDec(n);
        System.out.println("The decimal number:"+result);
    }
}