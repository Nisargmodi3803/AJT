package ShapeClone;

public class Circle extends shape
{
    public Circle()
    {
        type = "Circle";
    }

    @Override
    public void draw()
    {
        System.out.println("Circle is drawn");
    }
}
