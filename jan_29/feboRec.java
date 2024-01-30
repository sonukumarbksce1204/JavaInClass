package jan_29;

import java.util.Scanner;

public class feboRec {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int val=febo(n);
        System.out.println(val);
        input.close();
    }
    public static int febo(int n){
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 1;
        }
        else{
            return (febo(n-1)+febo(n-2));
        }
    }
}
