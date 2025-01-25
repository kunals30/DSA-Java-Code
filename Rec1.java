public class Rec1{
    public static void fun(int n){// n to 1
        if(n==0)return;
        System.out.print(n+" ");
        fun(n-1);
    }

    public static void fun2(int n){// 1 to n
        if(n==0)return;
        fun2(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        fun(5);
        System.out.println("");
        fun2(5);
    }
}
