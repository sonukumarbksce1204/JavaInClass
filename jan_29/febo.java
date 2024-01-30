package jan_29;

import java.util.Scanner;
public class febo {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a1=0;
        int a2=1;
        if(n==1){
            System.out.println(a2);
        }
        else{
            while(n-- >0){
                int temp=a1+a2;
                a1=a2;
                a2=temp;
            }
            System.out.println(a1);
        }
        input.close();
    }
    
}
