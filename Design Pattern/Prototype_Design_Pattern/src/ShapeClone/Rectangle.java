package ShapeClone;

public class Rectangle extends shape
{
    public Rectangle()
    {
        type="Rectangle";
    }

    @Override
    public void draw()
    {
        System.out.println("Rectangle is drawn");
    }
}
