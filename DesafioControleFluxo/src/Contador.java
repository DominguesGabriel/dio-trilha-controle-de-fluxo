import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
        int primeiroParametro;
        int segundoParametro;
        Scanner in = new Scanner (System.in);
        System.out.println("Digite o primeiro parâmetro");
        primeiroParametro = in.nextInt();
        System.out.println("Digite segundo parâmetro");
        segundoParametro = in.nextInt();
      try {
            contar(primeiroParametro,segundoParametro);
       } catch (ParametrosInvalidosException e) {
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }
      in.close();
    }
    
    public static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if(primeiroParametro > segundoParametro){
            throw new ParametrosInvalidosException();
        } 
        int contagem = segundoParametro - primeiroParametro;
        for(int i = 1; i<=contagem;i++){
            System.out.println("Imprimindo número " + i);
        }
    }
    }


