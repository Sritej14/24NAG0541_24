import java.util.Scanner;
class fact
{
 public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number:");
  int n=sc.nextInt();
  int i=n,fact=1;
  while(i>=1)
{
   fact=fact*i;
   i--;
}
System.out.println(fact);
}
}