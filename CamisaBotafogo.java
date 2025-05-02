public class CamisaBotafogo extends Camisa {

    public CamisaBotafogo(String fabrica, String time) {
        super(fabrica, time);
        
    }

    @Override
    void exibirInformacoes() {
        System.out.println("Marca: "+fabrica);
        System.out.println("Marca: "+time);
    }
}
