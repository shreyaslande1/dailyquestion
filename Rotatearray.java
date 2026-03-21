import java.util.Arrays;

public class Rotatearray{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr, 7);
        System.out.println(Arrays.toString(arr));
    }
    static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    static void reverse(int[] arr, int a, int b){
        while (a<b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
}