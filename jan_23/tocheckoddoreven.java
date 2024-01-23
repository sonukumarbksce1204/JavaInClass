package jan_23;
import java.util.Scanner;
public class tocheckoddoreven {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(n%2==0?"EVEN":"ODD");
        System.out.println((n/2*2)==n?"EVEN":"ODD");
        System.out.println((n&1)==0?"EVEN":"ODD");
        System.out.println((n^1)==n+1?"EVEN":"ODD");
        input.close();

    }    
}
