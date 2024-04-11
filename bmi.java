import java.util.Scanner;
class bmi
{
  public static void main(String[] args)
{
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the weight in kilograms");
     double w=s.nextDouble();
     System.out.println("Enter the height in meters");
     double h=s.nextDouble();
     double bmi=w/(h*h);
     if(bmi<18.5 )
      {
         System.out.println("person in Under weight");
       }
       else if (bmi>=18.5 && bmi<25)
        {
         System.out.println("person in Under weight");
        }
    else
       {
         System.out.println("person in Over weight");
     }
}
}