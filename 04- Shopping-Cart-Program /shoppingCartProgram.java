import java.util.Scanner;
public class shoppingCartProgram {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '£';
        double total; 

        System.out.print("What item would u like to buy: ");

        item = scanner.nextLine();

        System.out.print("How much does the " + item + " item cost: ");

        price = scanner.nextDouble();

        System.out.print("How many " + item +"s" + " are you buying: " );

        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("The total for " + quantity  + " " + item + "s" + " is " + currency + total );
  
        scanner.close();

        
    }
    
}