# program
just another respository
import java.io.*;
import java.util.*;
class pnz
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0)
        {
            System.out.print("Positive");
        }
        else if(n<0)
        {
            System.out.print("negative");
        }
        else if(n==0)
        {
            System.out.print("Zero");
        }
    }
}
