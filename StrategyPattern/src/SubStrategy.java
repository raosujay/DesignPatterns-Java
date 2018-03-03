public class SubStrategy implements Strategy {
    @Override
    public void operation(int a, int b) {
        System.out.println("Strategy sub:a-b="+(a-b));
    }
}
