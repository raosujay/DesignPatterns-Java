public class PrototypePaternDemo {

    public static void main(String[] args){
        ShapeCache.loadShape();
        Shape shape = ShapeCache.getShape("circle");
        shape.drow();
    }

}
