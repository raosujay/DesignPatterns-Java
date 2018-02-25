public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void drow() {
        System.out.println(type);
    }
}
