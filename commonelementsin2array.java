import java.util.Arrays;

public class commonelementsin2array {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {0,2,3,4,5,6,8};
        arr(arr1,arr2);
    }
    static void arr(int[] arr1, int[] arr2){
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    System.out.print(arr2[i]+" ");
                }
            }
        }
    }
    // static void arr(int[] arr1, int[] arr2){
    //     for(int i=0;i<arr2.length;i++){
    //         for(int j=0;j<arr1.length;j++){
    //             if(arr2[i]==arr1[j]){
    //                 System.out.print(arr2[i]+" ");
    //             }
    //         }
    //     }
    // }
}
