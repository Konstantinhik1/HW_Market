import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehaviour,QueueBehaviour{
    List<Actor> actor = new LinkedList<>();
    Queue<Actor> actorsQueue = new ArrayDeque<>();

    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " зашел в магазин");
        this.actor.add(actor);
    }

    @Override
    public void takeQueue(Actor actor) {
        actorsQueue.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
    }

    @Override
    public void giveOrders() {
        actorsQueue.peek().isMakeOrder();
        System.out.println(actorsQueue.peek().getName() + " сделал заказ");
    }

    @Override
    public void takeOrders() {
        actorsQueue.peek().isTakeOrder();
        System.out.println(actorsQueue.peek().getName() + " забрал заказ");
    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorsQueue.peek().getName() + " покинул очередь");
        actorsQueue.poll();
    }

    @Override 
    public void releaseFromMarket(List<Actor> actors) { 
        Actor removedActor = actorsQueue.poll(); 
        System.out.println(removedActor.getName() + " покинул магазин"); 
    }

     @Override
    public void update() {
    }

}

