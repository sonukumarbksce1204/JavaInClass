package feb_14;

public class MaxTillFive {
    int max2(int m1,int m2){
        return m1>m2?m1:m2;
    }
    int max3(int m1,int m2, int m3){
        int max=m1;
        if(max<m2){
            max=m2;
        }
        if(max<m3){
            max=m3;
        }
        return max;
    }
    int max4(int m1,int m2,int m3,int m4){
        int max=m1;
        if(max<m2){
            max=m2;
        }
        if(max<m3){
            max=m3;
        }
        if(max<m4){
            max=m4;
        }
        return max;
    }
    int max4(int m1,int m2,int m3,int m4,int m5){
        int max=m1;
        if(max<m2){
            max=m2;
        }
        if(max<m3){
            max=m3;
        }
        if(max<m4){
            max=m4;
        }
        if(max<m5){
            max=m5;
        }
        return max;
    }
}
