public class NikeFactory implements Factory{

    @Override
    public Camisa factoryMethod() {
        return new CamisaBrasil("Nike", "Brasil");
    }
    
}
