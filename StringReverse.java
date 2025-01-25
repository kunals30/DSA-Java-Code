import java.util.*;

public class StringReverse{
    public static void main(String args[]){

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a String: ");

        String str = myObj.nextLine();
        String res = "";

        for(int i = str.length()-1; i>=0; i--){
            res += str.charAt(i);
        }

        System.out.println(res);
    }
}