package NetworkConnection;

public class NetworkConnection implements Cloneable
{
    private String ip;
    private String importantMsg;

    public String getip()
    {
        return ip;
    }

    public String getImportantMsg()
    {
        return importantMsg;
    }

    public void setip(String ip)
    {
        this.ip = ip;
    }

    public void loadImportantMsg(String importantMsg) throws InterruptedException {
        Thread.sleep(5000);
        this.importantMsg = importantMsg;
    }

    @Override
    public String toString()
    {
        return this.ip+" : "+this.importantMsg;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



}
