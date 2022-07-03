public class main {
    
    public static void main(String[] args)
    {
        AbstractFactory abstractFactory = FactoryProducer.getFactory(true);
        Shape shape1 = abstractFactory.getShape("Circle");
        shape1.draw();

        AbstractFactory abstractFactory2 = FactoryProducer.getFactory(false);
        Shape shape2 = abstractFactory2.getShape("Rectangle");
        shape2.draw();
    }
}
