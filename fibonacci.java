import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the number you want to print fibonacci series up to that number: ");
        int n = in.nextInt();
        fibonacci(n);
    }
    static void fibonacci(int n){
        
        for(int i=0;i<n;i++){
            if(i==0){
                System.out.print(0+" ");
            }else if(i==1){
                System.out.print(1+" ");
            }else{
                System.out.print((i-2)+(i-1)+" ");
            }
        }
    }
}
