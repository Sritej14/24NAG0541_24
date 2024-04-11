import java.util.Scanner;
class Product 
      {
    public static void main(String[] args) 
       {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product price:");
        double productPrice = scanner.nextDouble();
        System.out.println("Are you a premium member? (yes/no)");
        String premiumMemberStatus = scanner.next().toLowerCase();
        double discountAmount = 0.0;
        if (productPrice > 100)
            {
            if (premiumMemberStatus.equals("yes")) 
              {
                discountAmount = productPrice * 0.20; 
              } 
              else 
                {
                discountAmount = productPrice * 0.10; 
                }
        if (discountAmount > 0) 
            {
            System.out.println("You qualify for a discount of $" + discountAmount);
            System.out.println("Your final price after discount: $" + (productPrice - discountAmount));
             } 
        else 
          {
            System.out.println("Sorry, no discount available for this product.");
            System.out.println("Your final price: $" + productPrice);
         }

        scanner.close();
    }
}
}
