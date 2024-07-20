public class ShapeFactory {

    public Shape getShape(String shape){
        return switch (shape) {
            case "Square" -> new Square();
            case "Circle" -> new Circle();
            case "Triangle" -> new Triangle();
            default -> {
                System.out.println("Invalid shape");
                yield null;
            }
        };
    }
}
