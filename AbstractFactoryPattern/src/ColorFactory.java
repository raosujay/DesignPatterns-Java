public class ColorFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        return null;
    }

    @Override
    Color getColor(String colorType) {
        if(colorType == null){
            return null;
        }
        if (colorType.equalsIgnoreCase("red")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("Yellow")){
            return new Yellow();
        } else{
            return null;
        }
    }
}
