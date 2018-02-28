import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static final Map<String, Shape> map = new HashMap<String, Shape>();

    public static Shape getShape(String color) {
        if (!map.containsKey(color)) {
            map.put(color, new Cricle(color));
            System.out.println("Creating circle of color : " + color);
        }
        return map.get(color);
    }

}
