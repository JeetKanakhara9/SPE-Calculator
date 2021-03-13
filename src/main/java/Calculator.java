import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void  main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter a Choice\n1.Square Root\n2.Factorial\n3.Log\n4.Power");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1 :
                System.out.print("Enter the number for which you want to find square root : ");
                Double n=s.nextDouble();
                square_root(n);
                break;
            case 2:
                System.out.print("Enter the number for which you want to find factorial : ");
                long num=s.nextLong();
                fact(num);
                break;
            case 3:
                System.out.print("Enter the number for which you want to find log : ");
                Double l=s.nextDouble();
                log(l);
                break;
            case 4:
                System.out.print("Enter base : ");
                Double b=s.nextDouble();
                System.out.print("Enter exponent : ");
                Double e=s.nextDouble();
                power(b,e);
                break;

        }
    }

    public static double square_root(Double n)
    {

        Double ans=Math.sqrt(n);
        System.out.println("The square root of  " + n+ "is : "+ ans);
        logger.info("Square root of num : "+ n + "is  : "+ans);
        return ans;

    }

    public static long fact(long n)
    {
        long f=1,i;
        for(i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial of "+ n +" is : "+f);
        logger.info("Factorial of "+ n +" is : "+f);
        return f;
    }

    public static double log(Double n)
    {
        Double ans=Math.log(n);
        System.out.println("The log of  " + n+ " is :"+ ans);
        logger.info("The log of  " + n+ " is :"+ ans);
        return ans;

    }

    public static double power(Double b,Double e)
    {

        Double ans=Math.pow(b,e);
        System.out.println("The result of "+b+" raised to the power "+e+" is : "+ans);
        logger.info("The result of "+b+" raised to the power "+e+" is : "+ans);
        return ans;
    }
}
