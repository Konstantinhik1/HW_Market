


// 1. Интерфейс ActorBehavoir,который будет содержать
// описание возможных действий актора в очереди/магазине
// 2. Абстрактный класс Actor,который хранит в себе
// параметры актора, включая состояние готовности сделать
// заказ и факт получения заказа.
//  Дополнение: для большего понимания, можно сделать методы-геттеры для имени и прочих
// “персональных данных” abstract
// 3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir

public abstract class Actor implements ActorBehavoir{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    
    public abstract String getName();
    protected abstract void add(Actor actor);
    
}