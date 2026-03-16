import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // calculate the area of a rectangle or square

        System.out.print("Enter the base of the rectangle or square: ");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the rectangle or square");

        double height = scanner.nextDouble();

        double area = base * height;

        System.out.println("Your area is: " + area);


    }
}
/*
 * To accept user input, we need an object called scanner

one problem you could have, is that if u accept an int then a var from the user 
 so you have to write a scanner.nextLine(); but assign it to nothign
 */