package apr_15;
import java.util.*;
public class MinArr {
    // public int[] minArr(int[] arr){
    //     Arrays.sort(arr);
    //     int[] res=new int[3];
    //     for(int i=0;i<3;i++){
    //         res[i]=arr[i];
    //     }
    //     return res;
    // }

    // public int[] minArr(int[] arr){
    //     Queue<Integer> pq=new PriorityQueue<>(ls);
    //     for(var i:arr){
    //         pq.add(i);
    //     }
    //     int[] res=new int[3];
    //     for(int i=0;i<3;i++){
    //         res[i]=pq.poll();
    //     }
    //     return res;
    // }

    public int[] minArr(int[] arr){
        Queue<Integer> pq=new PriorityQueue<>(arr);
        int[] res=new int[3];
        for(int i=0;i<3;i++){
            res[i]=pq.poll();
        }
        return res;
    }

    public static void main(String[] args){
        MinArr obj=new MinArr();
        int[] ar={1,10,20,5,50};
        int[] arr=obj.minArr(ar);
        for(var i:arr){
            System.out.println(i);
        }
    }
}
