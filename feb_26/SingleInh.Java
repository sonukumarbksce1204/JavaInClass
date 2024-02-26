package feb_26;
import java.util.Scanner;
class Shape{
    int side;
    double area(double... s){
        if(side==2){
            return s[0]*b[1];
        }
        else if(side==3){
            return 0.5*s[0]*s[1];
        }
    }
    double perimeter(double... s){
        if(side==2){
            return 2*(s[0]+s[1]);
        }
        else if(side==3){
            return s[0]+s[1]+s[2];
        }
    }
    int getSide(){
        return side;
    }
}

class Triangle extend Shape{
    double s;
    double b;
    double h;
    Rectanle(double s, double b,double h){
        super();
        this.s=s;
        this.b=b;
        this.h=h;
    }
    double perimeterTri(){
        return super.perimeter(s,b,h);
    }
    double areaTri(){
        return super.area(b,h);
    }
}
class Rectanle extend Shape{
    double l;
    double b;
    Rectanle(double l, double b){
        super();
        this.l=l;
        this.b=b;
    }
    double perimeterRec(){
        return super.perimeter(l,b);
    }
    double areaRec(){
        return super.area(l,b);
    }
}

public class SingleInh{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Shape s=new Shape();
        s.side=input.nextInt();
        if(s.side==2){
            double l=input.nextDouble();
            double b=input.nextDouble();
            Rectanle rec=new Rectanle(l,b);
            double area=rec.areaRec();
            double peri=rec.perimeterRec();
            
        }
        if(s.side==3){
            double s=input.nextDouble();
            double b=input.nextDouble();
            double h=input.nextDouble();
            Triangle tri=new Triangle(s,b,h);
            double area=tri.areaTri();
            double peri=tri.perimeterTri();
        }
        input.close();
    }
}