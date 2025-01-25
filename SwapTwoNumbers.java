// Swapping two variables without using the third variable
public class SwapTwoNumbers{
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println("The Old Numbers:"+"a:"+a+" b:"+b);

        //New number with using third variable

        int c = a;
        a = b;
        b = c;
        System.out.println("The Old Numbers:"+"a:"+a+" b:"+b);

        //New Numbers without using the third variable
         a = a+b;
         b = a-b;
         a = a-b;

         System.out.println("The Old Numbers:"+"a:"+a+" b:"+b);
    }
}