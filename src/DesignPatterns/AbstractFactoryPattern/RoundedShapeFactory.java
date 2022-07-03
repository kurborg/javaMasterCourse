public class RoundedShapeFactory extends AbstractFactory{
    
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("Rectangle"))
            return new RoundedRectangle();
        else if(shapeType.equalsIgnoreCase("Circle"))
            return new RoundedCircle();

        return null;
    }
}
