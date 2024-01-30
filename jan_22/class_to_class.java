
class Metric{
    int km;
    int m;
    Metric(int k,int meter){
        km = k;
        m = meter;
    }
    Metric(Impereal i){
        km=(i.mile)*1.6;
        m=(i.foot)*3.2;
    }
}

class Impereal{
    int mile;
    int foot;    
    Impereal(int m,int f){
        mile = m;
        foot = f;
    }
    
}

public class CtoC {
    public static void main(String[] args) {
        Metric m = new Metric(10, 1);
        Impereal i = new Impereal(10,1);
        System.out.println("the value of impereal obj is "+ i.mile +", " + i.foot);
        i = new Metric(i);
        System.out.println("the value of impereal obj now is "+ i.mile +", " + i.foot);
    }
}