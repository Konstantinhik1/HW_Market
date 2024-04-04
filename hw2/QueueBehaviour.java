public interface QueueBehaviour {
    void takeQueue (Actor actor);
    void takeOrders ();
    void giveOrders();
    void releaseFromQueue();
}

