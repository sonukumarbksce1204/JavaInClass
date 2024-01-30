package jan_30;

import java.util.Scanner;
public class PatternPyramid{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        PatternPyramid obj=new PatternPyramid();
        obj.pattern(n);
        input.close();
    }
    void pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    
}
