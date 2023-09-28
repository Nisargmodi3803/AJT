package ShapeClone;

import java.util.Hashtable;

public class ShapeCache
{
    private static Hashtable<String,shape> shapeMap = new Hashtable<>();

    public static shape getShape(String shapeId) throws CloneNotSupportedException
    {
        shape cachedShape = shapeMap.get(shapeId);
        return (shape) cachedShape.clone();
    }

    public static void loadShape()
    {
        System.out.println("Starting Object Creation & Caching");
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getType(),rectangle);
        System.out.println("Object creation & Caching completed");
    }
}
