package ShapeClone;

public abstract class shape implements Cloneable
{
    private String id;
    protected String type;

    public abstract void draw();

    public String getId()
    {
        return this.id;
    }

    public String getType()
    {
        return this.type;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    @Override
    public Object clone()
    {
        Object clone = null;
        try {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }

        return clone;
    }

}
