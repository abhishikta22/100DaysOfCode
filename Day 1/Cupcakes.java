import java.util.*;
class Cupcakes{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in); 
        int t= sc.nextInt();
        while(t>0)
        {
            int n= sc.nextInt();
            System.out.println(n/2+1);
            t-=1;
            }            
        }
    }