package jan_31;
import java.util.Scanner;
public class ArrayAgv {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        ArrayAgv obj=new ArrayAgv();
        double agv=obj.average(arr);
        System.out.println(agv);
        input.close();
    }
    double average(int[] arr){
        double avg=0;
        for(int i=0;i<arr.length;i++){
            avg+=arr[i];
        }
        return avg/arr.length;
    }
    
}
