import java.util.Arrays;
public class Secondlargest {
    public static void main(String[] args) {
        int[] arr = {8,2,2,2,2,5,1,1,1,1,11,9};
        secondsmallest(arr);
    }
    static void secondsmallest(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
            for(int i=1;i<arr.length-1;i++){
                if(arr[i]!=arr[i-1]){//1,1,1,1,2,2,2,2,5,8,9,11
                    System.out.print(arr[i]);
                    return;
                }
            }
    }
}

