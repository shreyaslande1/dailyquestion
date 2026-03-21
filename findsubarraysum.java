public class findsubarraysum{
    public static void main(String[] args) {
        int[] arr = {4,2,7,1,3};
        int k = 10;
        findsubarray(arr,k);
    }
    static void findsubarray(int[] arr, int k){
        int start = 0;
        int sum = 0;
        for(int end = 0;end<arr.length;end++){
            sum+=arr[end];
            while(sum>k){
                sum-=arr[start];
                start++;
            }
            if(sum==k){
                System.out.println("the subarray is found from index "+ start +" to index "+end);
                int temp = 0;
                for(int i = start;i<=end;i++){
                    temp+=arr[i];
                }
                System.out.println("the sum is "+temp);
                return;
            }
        }
        System.out.println("the sum range is not found");
    }
}