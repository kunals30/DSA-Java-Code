import java.util.*;

public class CheckingStringPalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String inpString = sc.nextLine();
        String palindromeString = "";
        inpString = inpString.replaceAll("\\s", "");

        for(int i=inpString.length()-1; i>=0; i--){
            palindromeString += inpString.charAt(i);
        }


        if(inpString.equals(palindromeString)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not palindrome");
        }

    }
}