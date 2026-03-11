import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number you want to print fibonacci series up to that number: ");
        int n = in.nextInt();
        // fibo(n);

        //fibonacci series using reccursioon
        for(int i=0;i<n;i++){
            int a = fibousingrec(i);
            System.out.print(a+" ");
        }
    }
    static void fibo(int n){
        int a = 0;
        int b = 1;
        
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int temp = a+b;
            a = b;
            b = temp;
        }
    }
    static int fibousingrec(int n){
        if(n==0 || n==1){
            return n;
        }
        return (fibousingrec(n-2)+fibousingrec(n-1));
    }
}
