public abstract class Shape {

    protected DrawAPI drawAPI;

    public Shape() {
    }

    public Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
