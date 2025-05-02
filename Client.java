import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        
      Scanner scan = new Scanner(System.in);

      System.out.println("Escolha o time");
      System.out.println("1 - Brasil");
      System.out.println("2 - Flamengo");
      System.out.println("3 - Botafogo");
      System.out.println("4 - Fluminense");
      System.out.println("5 - Vasco");
      System.out.println("Digite o número da sua escolha");

      int escolha = scan.nextInt();
      Factory factory = null;

      switch (escolha) {
        case 1:
            factory = new NikeFactory();
            break;
        case 2:
            factory = new AdidasFactory();
            break; 
        case 3:
            factory = new PumaFactory();
            break;
        case 4:
            factory = new UmbroFactory();
            break;
        case 5:
            factory = new KappaFactory();
            break;   
        default:
            System.out.println("Opção incorreta");
      }

      Camisa camisa = factory.factoryMethod();
      camisa.exibirInformacoes();
    }
}
