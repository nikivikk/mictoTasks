public class SubCommand implements ICommand {
    private double num1;
    private double num2;
    public SubCommand(double a, double b)
    {
        num1 = a;
        num2 = b;
    }
    public void Execute()
    {
        System.out.println(num1+num2);
    }
}
