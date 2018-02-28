import java.util.Random;

public class Demo {
    private static final String[] colors = new String[]{"red", "green", "black", "yellow", "blue"};

    public static void main(String[] args) {
        for (int i = 0; i < colors.length; i++) {
            Shape shape = ShapeFactory
                    .getShape(colors[(int) (Math.random() * colors.length)]);
            shape.draw();
        }
    }
}
