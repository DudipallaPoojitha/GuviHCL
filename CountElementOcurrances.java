import java.util.*;
public class CountElementOcurrances{
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int count=0;
        Boolean found = false;
        for(int i=0;i<N;i++){
            int num=sc.nextInt();
            if(num==K){
                count++;
                found=true;
            }
        }
        if(found){
            System.out.println(count);
        }
        else{
            System.out.println("-1");
        }
    }
}