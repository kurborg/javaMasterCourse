public class ShapeFactoryTest {
    
    public static void main(String[] args)
    {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("ReCtangLe");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("SquAre");
        shape3.draw();
    }
}
