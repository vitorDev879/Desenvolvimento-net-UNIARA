public class PizzaCentro implements PizzaFactory{

    @Override
    public Pizza criarPizza()  {
        return new PizzaCalabresa();
    }
}
