public class UmbroFactory implements Factory{

    @Override
    public Camisa factoryMethod() {
        return new CamisaFluminense("Umbro", "Fluminense");
    }
    
}
