public class KappaFactory implements Factory{

    @Override
    public Camisa factoryMethod() {
        return new CamisaVasco("Kappa", "Vasco");
    }
    
}
