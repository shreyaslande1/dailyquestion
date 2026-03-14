public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,25};
        int a = binarysearch(arr,110);
        System.out.println(a);
    }
    static int binarysearch(int[] arr, int target){
        int st = 0;
        int end = arr.length-1;
        while(st<end){
            int mid = st+(end-st)/2;
            if(arr[mid]==target){
                return mid;
            }else{
                if(arr[mid]>target){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }
        }
        return -1;
    }
}
