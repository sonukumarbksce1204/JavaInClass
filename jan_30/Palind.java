package jan_30;
import java.util.Scanner;
public class Palind {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        boolean b=palinCheeck(num);
        System.out.println(b?"Palindrome":"Not Palindrome");
        input.close();
        

    }
    public static boolean palinCheeck(int n){
        int a=n;
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev==a;
    }

    
}
