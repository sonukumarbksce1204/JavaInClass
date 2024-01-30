package jan_30;

import java.util.Scanner;
public class Pattern {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        pattern(n);
        input.close();
    }
    public static void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
