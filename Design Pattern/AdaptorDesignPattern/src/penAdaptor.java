public class penAdaptor implements Pen
{
    pilotPen pp = new pilotPen();
    @Override
    public void write(String str)
    {
        pp.mark(str);
    }
}
