package ShapeClone;

public class Test
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ShapeCache.loadShape();

        shape clonedShape1 = (shape) ShapeCache.getShape("1");
        System.out.println("Shape : "+clonedShape1.getType());

        shape clonedShape2 = (shape) ShapeCache.getShape("2");
        System.out.println("Shape : "+clonedShape2.getType());
    }
}
