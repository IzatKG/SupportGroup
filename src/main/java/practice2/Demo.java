package practice2;

public class Demo {
    public static void main(String[] args) {
//        counter(3);

        Demo obj =new Demo();
//        System.out.println(obj.fact(5));
//        System.out.println(pow(2,3));
        System.out.println(obj.fibonacci(6));

    }
    public static void counter (int n){
        System.out.println(n);
        if(n==0)
            return;
        counter(n-1);
    }
    int fact(int n) {
        int result;

        if (n == 1)
            return 1;
        result = fact(n - 1) * n;
        return result;
    }

    static int pow(int x,int n){
        if(n!=1) return x*pow(x,n-1);
        else return x;
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else{
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
    }

}
