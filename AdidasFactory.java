public class AdidasFactory implements Factory{

    @Override
    public Camisa factoryMethod() {
        return new CamisaFlamengo("Adidas", "Flamengo");
    }
    
}
