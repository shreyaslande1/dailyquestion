import java.util.Arrays;

public class insert0atlast {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,3,4,0,4,0,9,9,0,1};
        int index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
