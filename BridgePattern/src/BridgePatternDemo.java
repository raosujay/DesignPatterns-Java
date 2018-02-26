public class BridgePatternDemo {
    public static void main(String[] args){
         Shape redCircle = new Circle(new RedCircle());
         Shape greenCircle = new Circle(new GreenCircle());

         redCircle.draw();
         greenCircle.draw();

    }
}
