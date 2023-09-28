package Shape;



public class simpleShapeFactory extends ShapeAbstractFactory
{
    @Override
    public shape getshape(String shapeName)
    {
        if(shapeName.equalsIgnoreCase("Rectangle"))
        {
            return new Rectangle();
        } else if (shapeName.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}
