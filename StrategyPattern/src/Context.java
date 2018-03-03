public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void operation(int a,int b){
        strategy.operation(a,b);
    }
}
