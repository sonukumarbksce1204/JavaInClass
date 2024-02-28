package feb_27;
import java.util.Arrays;

public class ArrayQuest2 {
    public boolean arrayCheck(int[] arr){
        Arrays.sort(arr);
        for(int i=2;i<arr.length;i=i+2){
            if(arr[i-2]==arr[i]){
                return false;
            }
        }
        return true;
    }
    public void splitArr(int[] arr,int[] arr1,int[] arr2){
        int x=0;
        int y=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr1[x]=arr[i];
                x++;
            }
            else{
                arr2[y]=arr[i];
                y++;
            }
        }
    } 
    public static void main(String[] args){
        int[] arr={1,1,2,2,3,4,5,6};
        ArrayQuest2 obj=new ArrayQuest2();
        boolean check=obj.arrayCheck(arr);
        System.out.println(check);
        int[] arr1=new int[arr.length/2];
        int[] arr2=new int[arr.length/2];
        if(check){
            obj.splitArr(arr,arr1,arr2);
        }
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
    
}
