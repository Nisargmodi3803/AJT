package withThread;

public class Logger
{
    private Logger(){}
    public static class LoggerHolder
    {
        private static Logger myInstance = new Logger();
    }

    public static Logger getInstance()
    {
        return LoggerHolder.myInstance;
    }

    public void log(String s)
    {
        System.err.println(s);
    }


}
