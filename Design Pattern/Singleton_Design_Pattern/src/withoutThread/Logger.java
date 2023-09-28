package withoutThread;

public class Logger
{
    private static Logger myInstance;
    private Logger()
    {}

    public static Logger getInstance()
    {
        if(myInstance==null)
            myInstance = new Logger();

        return myInstance;
    }

    public void log(String s)
    {
        System.err.println(s);
    }
}
