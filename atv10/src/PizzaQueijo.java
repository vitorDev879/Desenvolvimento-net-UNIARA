public class PizzaQueijo implements Pizza {

    @Override
    public void preparar() {
        System.out.println("Preparando pizza de queijo");
    }

    @Override
    public void assar() {
        System.out.println("Assando pizza de queijo");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando pizza de queijo");
    }

    @Override
    public void embalar() {
        System.out.println("Emabalando pizza de queijo");
    }
}
