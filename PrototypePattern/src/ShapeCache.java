import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String,Shape> shapes = new Hashtable<String,Shape>();

    public static Shape getShape(String key){
        Shape shape = shapes.get(key);
        return (Shape) shape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapes.put(shapeKey, shape);
    // 例如，我们要添加2种形状

    public static void loadShape(){
        Circle circle = new Circle();
        circle.setId("circle");
        shapes.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("square");
        shapes.put(square.getId(),square);

    }
}
