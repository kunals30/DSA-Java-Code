
import java.util.Scanner;

public class CheckStringPalindrome{

    public static boolean checkStringPalindrome(String s){
        String res = "";

        for(int i=s.length()-1; i>=0; i--){
            res += s.charAt(i); 
        }

            if(res.equals(s)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = sc.nextLine();

        Boolean result = checkStringPalindrome(str);

        System.out.println(result);
    }
}