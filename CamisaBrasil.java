public class CamisaBrasil extends Camisa{

    public CamisaBrasil(String fabrica, String time) {
        super(fabrica, time);
    }

    @Override
    void exibirInformacoes() {
        System.out.println("Marca: "+ fabrica);
        System.out.println("Time: "+ time);
    }
}
