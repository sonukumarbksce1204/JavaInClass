package jan_23;
import java.util.Scanner;
public class BMI {
    Scanner input=new Scanner(System.in);
    double w=input.nextDouble();
    double h=input.nextDouble();
    System.out.println(h/w>25?"Obese":(h/w<=25&&h>18?"Fit":"Skinny"));
    input.close();
}
