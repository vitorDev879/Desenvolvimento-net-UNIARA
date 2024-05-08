public class PizzaOeste implements PizzaFactory{

    @Override
    public Pizza criarPizza() {
        return new PizzaQueijo();
    }
}
