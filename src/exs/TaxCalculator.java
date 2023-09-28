package exs;

public class TaxCalculator {
    public  void TaxCalculator()

    {

         double price = 121000;
         double tax = 10050;
         int quantity = 599;
         double total ;
         String message = "I want to buy "+ quantity + " shirt!";

     total = price*tax*quantity;
        System.out.println("Total cost with tax is : "+ total);

        System.out.println( message);

    }
}
