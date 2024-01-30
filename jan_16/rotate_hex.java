package jan_16;
import java.util.Scanner;
public class rotate_hex {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Integer x=input.nextInt();
        Integer y=input.nextInt();
        Integer x1=Integer.rotateLeft(x, 1);
        Integer x2=Integer.rotateLeft(x, 2);
        String s1=Integer.toHexString(x);
        String s2=Integer.toHexString(y);
        System.out.println(Integer.toString(x1)==s1&&Integer.toString(x2)==s2);
        input.close();
    }
}
