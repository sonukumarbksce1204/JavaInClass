package feb_12;

public class StringUnique {
    int uniquecheck(String str){
        int f=0;
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if((str.charAt(i))==((str.charAt(j)))&&(i!=j)){
                    f=1;
                }
            }
            if(f==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        StringUnique obj=new StringUnique();
        String s="ShSam";
        int i=obj.uniquecheck(s);
        System.out.println(i);
    }
    
}
