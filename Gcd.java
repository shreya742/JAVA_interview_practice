import java.util.*;
public class Gcd
{
public static void main(String[] args)
{
int a,b,gcd = 0;
System.out.print("\nEnter two numbers : ");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
int i;
for(i = 1; i <= a && i <= b; i++)
{
if((a % i == 0) && (b % i == 0))
{
gcd = i;
}
}
System.out.println("\nGCD of " + a + " and " + b + " is "+ gcd);
System.out.println();
}
}

