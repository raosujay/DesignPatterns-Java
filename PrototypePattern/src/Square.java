public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void drow() {
        System.out.println(type);
    }
}
