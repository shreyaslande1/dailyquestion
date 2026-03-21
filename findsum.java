public class findsum{
    public static void main(String[] args) {
        int n = 356;
        int rem = 0;
        int sum = 0;
        while(n>0){
            // reminder = a%10;
            // System.out.println("first reminder is "+reminder);
            // sum+=reminder;
            // System.out.println("value of a before: "+a);
            // a=a/10;
            // System.out.println("value of a after: "+a);
            rem = n%10;
            sum +=  rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}