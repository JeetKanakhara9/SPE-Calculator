import java.util.Scanner;

public class Main {
    public static void  main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a Choice\n1.Square Root\n2.Factorial\n3.Log\n4.Power");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1 :
                square_root();
                break;
            case 2:
                fact();
                break;

        }
    }

    public static void square_root()
    {
        System.out.print("Enter the number for which you want to find square root : ");
        Scanner s=new Scanner(System.in);
        Double n=s.nextDouble();
        Double ans=Math.sqrt(n);
        System.out.println("The square root of  " + n+ "is :"+ ans);

    }

    public static void fact()
    {
        System.out.print("Enter the number for which you want to find factorial : ");
        Scanner s=new Scanner(System.in);
        long n,f=1,i;
        n=s.nextLong();
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial of "+ n +" is : "+f);

    }
}
