package feb_27;
import java.util.Arrays;

public class ArrayQuest {
    public boolean arrayCheck(int[] arr){
        Arrays.sort(arr);
        for(int i=2;i<arr.length;i=i+2){
            if(arr[i-2]==arr[i]){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        int[] arr={1,2,3,1,2,3};
        ArrayQuest obj=new ArrayQuest();
        boolean v=obj.arrayCheck(arr);
        System.out.println(v);
    }
    
}
