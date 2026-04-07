import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {



        try {
            LimitadorIdade pessoa = new LimitadorIdade(19);
        
            System.out.println(pessoa.idade);

            try{
                pessoa.lerArquivo();
            }
            catch(FileNotFoundException e){
                System.out.println("Arquivo não encontrado.");
            }
        }

        catch(IdadeInvalidaException e){
            System.out.println("O sistema não aceita menores de idade");
        }

        try{
            int a = 10;
            int b = 0;

            int resultado = a/b;
            System.out.println(resultado);
        }

        catch(ArithmeticException e){        
            System.out.println("Erro: divisão por zero");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Continuando o programa.");

        try {
            int[] numeros = {1, 2, 3};

            System.out.println(numeros[5]);
        }

        catch (ArrayIndexOutOfBoundsException e){            
            System.out.println("Indice inválido");
        }

        catch (Exception e){
            System.out.println("Erro geral.");
        }

        finally {
            System.out.println("Operação Finalizada.");
        }

        // int x = 10;
        // int y = 0;

        // int[] a = new int[3];
        

    }
}
