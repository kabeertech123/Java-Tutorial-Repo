import java.util.Scanner;

public class ifStatements{

        public static void main(String[] args) {
        
                Scanner scanner = new Scanner(System.in);

        String item;
        double price = 0;
        int quantity = 0;
        char currency = '£';
        double total; 

        System.out.print("What item would u like to buy: ");

        item = scanner.nextLine();

        if(item == ""){
        System.out.println("Please enter an item");
                
        }

        System.out.print("How much does the " + item + " item cost: ");

        if (price <= 0){
        System.out.println("Please enter a valid price");
        }

        price = scanner.nextDouble();

        System.out.print("How many " + item +"s" + " are you buying: " );

        if (quantity <= 0){
        System.out.println("Please enter a valid quantity");
        }

        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("The total for " + quantity  + " " + item + "s" + " is " + currency + total );
  
        scanner.close();

            // all i did was just added if statements to check if the user inputted valid data, if not it will print out a message asking them to enter valid data.
        }

}