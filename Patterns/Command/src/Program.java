import java.util.Scanner;

public class Program {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter:\n1 to print message.\n2 to add two numbers.");
        int n=in.nextInt();
        ICommand a;
        switch (n)
        {
            case 1:
                System.out.println("Enter the message.");
                String str=in.nextLine();
                str=in.nextLine();
                a=new LogCommand(str);
                a.Execute();
                break;
            case 2:
                System.out.println("Enter two integer numbers.");
                int num1, num2;
                num1=in.nextInt();
                num2=in.nextInt();
                a=new SubCommand(num1, num2);
                a.Execute();
                break;
        }
    }
}
