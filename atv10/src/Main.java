public class Main {
    public static void main(String[] args) {

        PizzaFactory Centro = new PizzaCentro();
        PizzaFactory Oeste = new PizzaOeste();

        Pizza pizzaCentro = Centro.criarPizza();
        Pizza pizzaOeste = Oeste.criarPizza();

        pizzaCentro.preparar();
        pizzaCentro.assar();
        pizzaCentro.cortar();
        pizzaCentro.embalar();

        pizzaOeste.preparar();
        pizzaOeste.assar();
        pizzaOeste.cortar();
        pizzaOeste.embalar();
    }
}