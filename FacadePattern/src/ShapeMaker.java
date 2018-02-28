public class ShapeMaker {

    private Shape cricle;
    private Shape square;

    public ShapeMaker() {
        this.cricle = new Cricle();
        this.square = new Square();
    }

    public void drawCricle() {
        cricle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
