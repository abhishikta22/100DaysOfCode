import java.lang.*;
import java.util.*;
class Lapindrome {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){           
            String str=sc.next();
            int l=str.length();
            String h1="",h2="";
            h1=str.substring(0,l/2);
            if(l%2==0)
            h2=str.substring(l/2);
            else if(l%2!=0)
            h2=str.substring(l/2+1);
            char hc1[]=h1.toCharArray();
            char hc2[]=h2.toCharArray();                      
            Arrays.sort(hc1);
            Arrays.sort(hc2);
            String w1=String.copyValueOf(hc1);
            String w2=String.copyValueOf(hc2);
            if(w1.equalsIgnoreCase(w2))
            System.out.println("YES");
            else
            System.out.println("NO");
            t--;
        }
        sc.close();
    }
}