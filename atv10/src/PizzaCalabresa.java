public class PizzaCalabresa implements Pizza{

    @Override
    public void preparar(){
        System.out.println("Preparando pizza de calabresa");
    }

    @Override
    public void assar() {
        System.out.println("Assando pizza de calabresa");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando pizza de calabresa");
    }

    @Override
    public void embalar() {
        System.out.println("Embalando pizza de calabresa");
    }
}
