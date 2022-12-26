import java.io.Console;

public class LogCommand implements ICommand {
    private String message;

    public LogCommand(String _message)
    {
        message = _message;
    }
    public void Execute()
    {
        System.out.println(message);
    }
}
