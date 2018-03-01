public class Demo {
    public static void main(String[] args) {
        Order buyo = new BuyOrder(new Stock());
        Order sello = new SellOrder(new Stock());

        Broker broker = new Broker();
        broker.takeOrder(buyo);
        broker.takeOrder(sello);
        broker.placeOrder();

        System.out.println("----------------------------------------");

        broker.takeOrder(sello);
        broker.placeOrder();
    }
}
