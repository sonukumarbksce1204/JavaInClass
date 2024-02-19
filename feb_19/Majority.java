package feb_19;
public class Majority {
    int majority(int[] arr){
        int n=arr.length/2;
        for(int i=0;i<arr.length;i++){
            int c=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            if(c==n){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={2,3,2};
        Majority obj=new Majority();
        int ele=obj.majority(arr);
        System.out.println(ele);
    }
}
