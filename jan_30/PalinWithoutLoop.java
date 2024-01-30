package jan_30;

import java.util.Scanner;
public class PalinWithoutLoop {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int rev=revrse(n,0);
        System.out.println(rev==n);
        input.close();
    }
    public static int revrse(int n,int revnum){
        if(n==0){
            return revnum;
        }
        int lastdigit=n%10;
        revnum=revnum*10+lastdigit;
        return (revrse(n/10,revnum));
    }
    
}
