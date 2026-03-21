public class Mejorityelement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,2,2,2,2,2,2,2,2,2,8,5,4,6,5,2,2,2};
        int ans = mejority(arr);
        System.out.println(ans);
    }
    static int mejority(int[] arr){
        int count = 0;
        int current = 0;
        for(int num:arr){
            if(count==0){
                current=num;
            }
            if(current==num){
                count++;
            }else{
                count--;
            }
        }
        count = 0;
        for(int i=0;i<arr.length;i++){
            if(current==arr[i]){
                count++;
            }
        }
        if(count>arr.length/2){
            return current;
        }
        return -1;
    }
}