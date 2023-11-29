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
