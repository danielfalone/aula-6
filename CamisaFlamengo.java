public class CamisaFlamengo extends Camisa{

    public CamisaFlamengo(String fabrica, String time) {
        super(fabrica, time);
    }

    @Override
    void exibirInformacoes() {
        System.out.println("Marca: "+ fabrica);
        System.out.println("Time: "+ time);
    }
}
