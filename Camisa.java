public abstract class Camisa{
    public String fabrica;
    public String time;

    public Camisa(String fabrica, String time) {
        this.fabrica = fabrica;
        this.time = time;
    }

    abstract void exibirInformacoes();
    
}