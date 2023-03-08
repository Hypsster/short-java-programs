import java.util.Scanner;

public class prime_numbers
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        int number = userInput.nextInt();

        System.out.println(isPrime(number));
    }


    public static boolean isPrime(int n)
    {
        if (n == 2 || n % 2 != 0)
        {
            return true;
        }
        else if (n % 2 == 0)
        {
            return false;
        }
        return false;
    }
}

