
import java.util.Scanner;
public class Bmi {
    public static void main(){
        Scanner input=new Scanner(System.in);
        double w=input.nextDouble();
        double h=input.nextDouble();
        if(h/w>25){
            System.out.println("Obese");
        }
        else if(h/w<=25&&h>18){
            System.out.println("Fit");
        }
        else{
            System.out.println("Skinny");
        }
    input.close();
}
}