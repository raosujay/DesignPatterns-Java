public class BuyOrder implements Order {

    private Stock buyStock;

    public BuyOrder(Stock buyStock) {
        this.buyStock = buyStock;
    }

    @Override
    public void execute() {
        buyStock.buy();
    }
}
