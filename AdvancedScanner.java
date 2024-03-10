import java.util.*;

public class AdvancedScanner
{
    private Scanner newScanner;
    
    public AdvancedScanner()
    {
        newScanner = new Scanner(System.in);
    }

    public int getInput() throws InputMismatchException
    {
        int value;
        try
        {
            value = newScanner.nextInt();
            return value;
        }
        catch(InputMismatchException e)
        {
            return 0;
        }
    }

    public Scanner getScanner()
    {
        return newScanner;
    }
}