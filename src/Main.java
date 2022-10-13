import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);


        System.out.print("enter the first number");
        int num1 = in.nextInt();

        System.out.print("enter the second number");
        int num2 = in.nextInt();


        System.out.println(" ");
        String trash = in.nextLine();

        if (num1 == num2)
        {
            System.out.println( num1 + " is equal to " + num2);
        } else if (num1 > num2)
        {
            System.out.println( num1 + " is greater than " + num2);
        } else if (num1 < num2 )
        {
            System.out.println( num1 + " is less than " + num2);
        }


    }
}