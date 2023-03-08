import java.util.Scanner;

public class evenodd_checker {

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        int a = userInput.nextInt();

        if (a % 2 == 0)
        {
            System.out.println(a + " is an even number");
        }else
        {
            System.out.println(a + " is an odd number");
        }
    }
}
