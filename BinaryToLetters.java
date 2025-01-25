import java.util.*;

public class BinaryToLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary String:");
        String inpString = sc.nextLine();

        int countOfOne = 0;
        String outputString = "";

        char[] arr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        if (inpString.charAt(0) == '1') {
            for (int i = 0; i < inpString.length(); i++) {
                if (inpString.charAt(i) == '1') {
                    countOfOne++;
                }
                if (inpString.charAt(i) == '0' || i == inpString.length() - 1) {
                    if (countOfOne > 0) { // Ensure valid index
                        outputString += arr[countOfOne - 1];
                        countOfOne = 0;
                    }
                }
            }
        } else {
            System.out.println("Wrong input String");
            return;
        }

        System.out.println("The Binary to English word output is: " + outputString);
    }
}
