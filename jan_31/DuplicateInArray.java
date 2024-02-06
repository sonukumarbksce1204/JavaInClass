package jan_31;

import java.util.Scanner;
public class DuplicateInArray {

    boolean dupliCheck(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                    
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        DuplicateInArray obj=new DuplicateInArray();
        System.out.println(obj.dupliCheck(arr));
        input.close();
    }
    
}
