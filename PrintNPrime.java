import java.util.*;

public class PrintNPrime{

    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static ArrayList nPrime(int n){
        ArrayList<Integer>primeArr = new ArrayList<>();

        if(n==2){
            primeArr.add(2);
        }
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                primeArr.add(i);
            }
        }
        return primeArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int n = sc.nextInt();

        System.out.println(nPrime(n));

        int length = nPrime(n).size();
        System.out.println("The array length:"+ length);
    }
}