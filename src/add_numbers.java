import java.util.Scanner;


public class add_numbers
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.println("1st Number: ");
        double num1 = userInput.nextDouble();
        System.out.println("2nd Number: ");
        double num2 = userInput.nextDouble();
        double r = num1 + num2;
        System.out.println("The total is: " +  r);
    }
}