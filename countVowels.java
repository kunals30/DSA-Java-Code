import java.util.*;
public class countVowels{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();

        Integer countOfVowels = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)== 'a'||str.charAt(i)== 'a'||str.charAt(i)== 'e'||str.charAt(i)== 'i'||str.charAt(i)== 'o'||str.charAt(i)== 'u'){
                countOfVowels+=1;
            }
        }
        System.out.println("The vowels in the string are:"+countOfVowels);
    }
}