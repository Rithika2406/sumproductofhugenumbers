import java.math.BigInteger;
import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner S=new Scanner(System.in);
        BigInteger n1=new BigInteger(S.nextLine());
        BigInteger n2=new BigInteger(S.nextLine());
        BigInteger sum=n1.add(n2);
        BigInteger product=n1.multiply(n2);
        System.out.println(sum);
        System.out.println(product);
    }
}