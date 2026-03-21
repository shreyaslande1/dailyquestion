public class primeornot{
    public static void main(String[] args) {
        int n = 6;
        boolean a = isprime(n);
        if(a){
            System.out.println(n +" is prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }
    }
    static boolean isprime(int n){
        for(int i = 2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}