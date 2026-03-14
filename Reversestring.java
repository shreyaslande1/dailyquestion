import java.util.Arrays;
public class Reversestring {
    public static void main(String[] args) {
        String str = "hello";
        String s = reverse3(str);
        System.out.println(s);
    }
    static void reverse(String str){
        char[] ch = str.toCharArray();
        int i=0;
        int j=str.length()-1;
        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        System.out.print(ch);
    }
    static void reverse2(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse = reverse+str.charAt(i);
        }
        System.out.println(reverse);
    }
    static String reverse3(String str){
    if(str.isEmpty()){
        return str;
    }
    return reverse3(str.substring(1)) + str.charAt(0);
}
}