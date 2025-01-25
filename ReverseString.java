import java.util.*;

public class ReverseString{

    public static String reverseString(String s){
        String result = "";
        for(int i=s.length()-1; i>=0; i--){
            result += s.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String InputString = sc.nextLine();

        String Ans = reverseString(InputString);

        System.out.println("Reversed string is:"+ Ans);
    }
}