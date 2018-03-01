public class SellOrder implements Order {

    private Stock sellStock;

    public SellOrder(Stock sellStock) {
        this.sellStock = sellStock;
    }

    @Override
    public void execute() {
        sellStock.sell();
    }
}
