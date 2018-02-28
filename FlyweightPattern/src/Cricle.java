public class Cricle implements Shape {

    private String color;

    public Cricle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("color:"+color);
    }
}
