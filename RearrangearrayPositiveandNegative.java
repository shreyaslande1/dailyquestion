import java.util.Arrays;

public class RearrangearrayPositiveandNegative {
    public static void main(String[] args) {
        int[] arr = {-4,-5,-2,-3,8,2,9,5};
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rearrange(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(i%2==0 && arr[i]<0 || i%2==1 && arr[i]>0){
                for(int j=i+1;j<arr.length;j++){
                    if(i%2==0 && arr[j]>0 || i%2==1&&arr[j]<0){
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                }
            }
        }
    }
}
