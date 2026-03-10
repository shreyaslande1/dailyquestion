public class findsum{
    public static void main(String[] args) {
        int a = 345;
        int sum = 0;
        int reminder = 0;
        for(int i=0;i<3;i++){
            reminder = a%10;
            System.out.println("first reminder is "+reminder);
            sum+=reminder;
            System.out.println("value of a before: "+a);
            a=a/10;
            System.out.println("value of a after: "+a);
        }
        System.out.println(sum);
    }
}