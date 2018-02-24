public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        if (shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }else {
            return null;
        }
    }

    @Override
    Color getColor(String colorType) {
        return null;
    }
}
