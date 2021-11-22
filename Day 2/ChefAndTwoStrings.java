import java.util.*;
class ChefAndTwoStrings {
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);        
        int t=sc.nextInt();
        int max=0,min=0,i;
        while(t>0)
        {
            String s1=sc.next();
            String s2=sc.next();
            for(i=0;i<s1.length();i++)
            {
                if(s1.charAt(i)=='?' || s2.charAt(i)=='?')
                max+=1;
                else
                if(s1.charAt(i)!='?' && s2.charAt(i)!='?' && s1.charAt(i)!=s2.charAt(i))
                {
                    max+=1;
                    min+=1;
                }
            }
            System.out.println(min+" "+max);
            max=0;
            min=0;
            t-=1;
        }
        sc.close();
    }
    
}
