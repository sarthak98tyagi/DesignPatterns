public class FactoryClient {
    public static void main(String[] args){
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("Circle");
        Shape square = factory.getShape("Square");
        Shape triangle = factory.getShape("Triangle");
        circle.draw();
        square.draw();
        triangle.draw();
    }
}
