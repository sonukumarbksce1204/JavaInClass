package feb_6;

public class MatrixQuest {
    //not all 
    public static void markZero(int[][] arr){ 
        int x=-1,y=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==0&& i!=x &&j!=y){
                    arr[i][0]=0;
                    arr[i][1]=0;
                    arr[i][2]=0;
                    if(arr[i+1][j]!=0||arr[i+2][j]!=0){
                    x=i;
                    }
                    arr[0][j]=0;
                    arr[1][j]=0;
                    arr[2][j]=0;
                    y=j;
                    
                }
                
            }
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] arr={{0,0,3},{3,4,8},{5,6,0}};
        markZero(arr);
    }
    
}
