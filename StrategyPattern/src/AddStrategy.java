public class AddStrategy implements Strategy {
    @Override
    public void operation(int a, int b) {
        System.out.println("Strategy add:a+b="+(a+b));
    }
}
