public class CamisaFluminense extends Camisa{

    public CamisaFluminense(String fabrica, String time) {
        super(fabrica, time);
    }

    @Override
    void exibirInformacoes() {
        System.out.println("Marca: "+ fabrica);
        System.out.println("Time: "+ time);
    }

   
    
}
