package jan_29;

import java.util.Scanner;
public class sunEvenOdd {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a=n;
        int sum=0;
        while(a>0){
            if((a%10)%2==0&&n%2==0){
                sum+=a%10;
            }
            else if((a%10)%2!=0&&n%2!=0){
                sum+=a%10;
            }
            a/=10;

        }
        System.out.println(sum);
        input.close();

    }
    
}
