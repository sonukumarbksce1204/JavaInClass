package feb_5;
import java.util.Scanner;
import java.util.Arrays;


public class DuplicMiss {
    public int[] checkArr(int[] arr){
        int[] val=new int[2];
        int miss=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[i+1]){
                val[0]=arr[i];
            }
            if(miss==arr[i]){
                miss++;
            }
            else{
                miss=i+1;
                val[2]=miss;
            }
        }
        return val;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int arr[]={1,2,2,4};
        int[] a=checkArr(arr);
        
        
        input.close();
    }
}
