import java.io.Console;
import java.util.Scanner;

public class InputTest {
    public static void main(String[] agrs){

        //Scanner in = new Scanner(System.in);
        Console console = System.console();

        //get first input
        //System.out.print("What is your name?");
        //String name = in.nextLine();
        String name = console.readLine("Username:");

        //get second input
        //System.out.print("How old are you?");
        //int age = in.nextInt();
        char[] passwd = console.readPassword("Password:");

        //displau output on console
       // System.out.println("Hello," + name +", Next year you will be " + (age + 1));
        if (passwd.equals(123) && name.equals(1456))
        {
            System.out.print("sign in sucessfully");
        }
    }
}
