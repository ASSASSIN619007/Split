import java.util.*;
import java.io.*;
class Accounts
{   
    String name=null;
    int money;
    Scanner in=new Scanner(System.in);
    void input()
    {
        System.out.println("Enter name");
        name=in.nextLine();
        System.out.println("Enter money");
        money=in.nextInt();
    }
}
class Split 
{
    public static void main(String args[])throws NullPointerException
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter number of people");
        n=in.nextInt();
        Accounts ar[] = new Accounts[n];
        for(int i=0;i<n;i++)
        {
            ar[i].input();
        }
    }  
}
/**import java.util.*;
class Work
{   
    String S;
    Scanner in=new Scanner(System.in);
    String input()
    {
        S=in.nextLine();
        return S;
    }
}
class Split 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter number of people");
        n=in.nextInt();
        String arr[]=new String[n];
        Work w=new Work();
        System.out.println("Enter name");
        String str;
        int i;
        for(i=0;i<n;i=i+1)
        {
            arr[i]=w.input();
            //str=arr[i];
            //System.out.println(str);
        }int a;int b;int pay[n][]
        System.out.println("Enter choice 1.Input 2.Total");
        a=in.nextInt();
        switch(a)
        {
            case 1:
                System.out.println("Choose name");
                for(i=0;i<n;i=i+1)
                {
                    str=arr[i];
                    System.out.println(+(i+1)+""+str);
                }b=in.nextInt();
                
                break;
        }
    }  
}*/
