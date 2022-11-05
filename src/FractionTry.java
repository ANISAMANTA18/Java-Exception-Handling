import java.util.*;
public class FractionTry
{
    public static void main(String [] args)
    {
        int minnum=1,maxnum=10,minden=0,maxden=5;
        int n,d;
        Random randomNum=new Random();
        for (int i=1;i<=10;i++)
        {
            try
            {
                n=minnum+randomNum.nextInt(maxnum);
                //System.out.println (n);
                d=minden+randomNum.nextInt(maxden);
                //System.out.println (d);
                int f=n/d;
                System.out.println("\nFraction = "+n+"/"+d);
            }
            catch(ArithmeticException e)
            {
                System.out.println ("\nDivide by zero");
            }
            finally
            {
                System.out.println ("\nEnd of iteration "+i);
            }
        }
    }
}