public class PrototypePatternDemo {
    
    public static void main(String[] args){
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        clonedShape.draw();

        Shape clonedShape2 = ShapeCache.getShape("2");
        clonedShape2.draw();

        Shape clonedShape3 = ShapeCache.getShape("3");
        clonedShape3.draw();
    }
}
