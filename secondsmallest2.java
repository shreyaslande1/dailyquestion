public class secondsmallest2 {
    public static void main(String[] args) {
        int[] arr = {8,2,2,2,2,5,1,1,1,1,11,9};
        secondsmallest(arr);
    }
    static void secondsmallest(int[] arr){
        int i = 0;
        int largest = arr[i];
        for(i = 1;i<arr.length-1;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        int secondlargest = arr[0];
        for(int j =1;j<arr.length-1;j++){
            if(arr[j]<=largest && arr[j]>secondlargest){
                secondlargest = arr[j];
            }
        }
        System.out.print(secondlargest);
    }
}
