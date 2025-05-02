public class PumaFactory implements Factory{

    @Override
    public Camisa factoryMethod() {
        return new CamisaBotafogo("Puma", "Brasil");
    }
    
}
