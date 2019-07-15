import java.util.*;
class v
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.print(ch+ "is vowels");
        }
        else{
            System.out.print(ch+ "is consonant");
        }
    }
}
