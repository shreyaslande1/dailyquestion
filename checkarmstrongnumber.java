import java.lang.Math;
public class checkarmstrongnumber {
    public static void main(String[] args) {
        int n = 153;
        checkarmstrong(n);
    }
    static void checkarmstrong(int n){
        int sum = 0;
        int temp = n;
        int size = 0;
        while(n>0){
            n=n/10;
            size++;
        }
        // System.out.println("size is "+size);
        n = temp;
        // System.out.println("n is "+n);
        int rem = 0;
        while(n>0){
            rem = n%10;
            sum= (int)Math.pow(rem, size)+sum;
            n=n/10;
        }
    
        // System.out.println("sum is "+sum);
        if(sum==temp){
            System.out.println("ha number armstrong hao");
        }
        else{
            System.out.println("number armstrong nahi hao");
        }
    }
}
