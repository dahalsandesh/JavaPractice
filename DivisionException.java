//get two integer from the user & perform division catching the exception
import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisionException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println(("Enter first integer:"));
            int a= scan.nextInt();
            System.out.println(("Enter second integer:"));
            int b= scan.nextInt();
            int ans= a/b;
            System.out.println(ans);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println("Enter only integer");
        }
        finally{
            System.out.println("The End");
        }
    }
}
