public class Demo {
    public static void main(String[] args){

        Context context1 = new Context(new AddStrategy());
        Context context2 = new Context(new SubStrategy());

        context1.operation(2,4);
        context2.operation(2,4);

    }
}
