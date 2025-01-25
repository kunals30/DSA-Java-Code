public class Rec2{
    public static int sum(int n){
        if(n==1) return 1;
        return n+sum(n-1);
    }

    public static void main(String[] args) {
        int result = sum(3);
        System.out.println("Sum is: "+result);
    }
}