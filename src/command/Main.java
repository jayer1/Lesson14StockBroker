package command;

public class Main {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        Order buyStockOrder = new BuyStock(abcStock);
        Order sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
        
        System.out.println("Undo orders...");
        buyStockOrder.undo(); //undo would be a sell
        sellStockOrder.undo(); //undo would be a buy
        
       
        //broker.placeOrders();
        
    }

}
