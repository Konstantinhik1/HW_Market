public class TestProgram {
    public static void main(String[] args) {
        Actor actor1 = new Human("John");
        Actor actor2 = new Human("Anna");
        Market market = new Market();
        
        market.acceptToMarket(actor1);
        market.acceptToMarket(actor2);
        
        market.takeQueue(actor1);
        market.takeQueue(actor1);
        
        market.giveOrders();
        market.takeOrders();
        
        market.releaseFromQueue();
        
        market.releaseFromMarket(market.actor);
    }
}