import java.lang.*;
import java.util.*;
class PuppyAndSum {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int sum=0;
            int d=sc.nextInt();
            int n=sc.nextInt();
            for(int i=1;i<=d;i++)
            {              
                for(int j=1;j<=n;j++){
                    sum=sum+j;
                }
                n=sum;
                sum=0;
            }
            System.out.println(n);
            t--;
        }
    }
}