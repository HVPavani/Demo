import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        char operator;
        double x,y,z;

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the operator");
        operator=scan.next().charAt(0);

        System.out.println("Enter the first number");
        x=scan.nextDouble();

        System.out.println("Enter the second number");
        y=scan.nextDouble();

        switch (operator)
        {
            case '+':z=x+y;
            System.out.println(x+"+"+y+"="+z);
            break;

            case '-':z=x-y;
            System.out.println(x+"-"+y+"="+z);
            break;

            case '*':z=x*y;
            System.out.println(x+"*"+y+"="+z);
            break;

            case '/':z=x/y;
            System.out.println(x+"/"+y+"="+z);
            break;

            default:System.out.println("Invalid operator!!");
            break;
        }
        scan.close();
    }
}