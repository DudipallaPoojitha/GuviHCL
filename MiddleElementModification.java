import java.util.Scanner;

public class MiddleElementModification {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine().trim();
        int len=S.length();
        String result;
        if(len%2==1){
            int mid=(len-1)/2;
            result=S.substring(0,mid)+"*"+S.substring(mid+1);
        }else{
            int mid1=(len/2)-1;
            int mid2=len/2;
            result=S.substring(0,mid1)+"**"+S.substring(mid2+1);
        }
        System.out.println(result);
        
    }
    
}
