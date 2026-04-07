import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // ------ EXERCICIO 1 ------

        System.out.println("Insira um número inteiro: ");
        int a = sc.nextInt();

        System.out.println("Insira outro número inteiro: ");
        int b = sc.nextInt();

        try{
            int resultado = a/b;
            System.out.println("Resultado: " + resultado);
        }

        catch(ArithmeticException e){
            System.out.println("Não é possível dividir por zero.");
        }

        // ------ EXERCICIO 2 ------

        System.out.println("Digite um número inteiro: ");
        
        try {
            int numero = sc.nextInt();
            System.out.println("Você digitou: " + numero);
        }

        catch (InputMismatchException e){
            System.out.println("Por favor, insira um número inteiro.");
        }

        // ------ EXERCICIO 3 ------
    
        int vetor[] = {2, 4, 6, 8, 10};

        System.out.println("Escolha a posição do vetor que gostaria de acessar: ");
        try{
            int posicao = sc.nextInt();
            System.out.println("Valor na posição " + posicao + ": " + vetor[posicao]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Índice inválido. Escolha um número entre 0 e 4");
        }

        // ------ EXERCICIO 4 ------

        System.out.println("Digite um número inteiro: ");
        String num = sc.next();

        try{
            int numero = Integer.parseInt(num);
            System.out.println("Você digitou: " + numero);
        }

        catch (NumberFormatException e){
            System.out.println("Por favor, insira um número inteiro.");
        }

        // ------ EXERCICIO 5 ------

        System.out.println("Insira o valor inteiro do dividendo: ");
        int dividendo = sc.nextInt();

        System.out.println("Insira o valor inteiro do divisor: ");
        int divisor = sc.nextInt();
        sc.close();

        try{
            int resultado = dividendo/divisor;
            System.out.println("Resultado da divisão: " + resultado);
        }

        catch (ArithmeticException e){
            System.out.println("Não é possível dividir por zero.");
        }

        finally {
            System.out.println("Fim do Programa.");            
        }

        // ----------- FIM -----------

        // try {
        //     LimitadorIdade pessoa = new LimitadorIdade(19);
        
        //     System.out.println(pessoa.idade);

        //     try{
        //         pessoa.lerArquivo();
        //     }
        //     catch(FileNotFoundException e){
        //         System.out.println("Arquivo não encontrado.");
        //     }
        // }

        // catch(IdadeInvalidaException e){
        //     System.out.println("O sistema não aceita menores de idade");
        // }

        // try{
        //     int a = 10;
        //     int b = 0;

        //     int resultado = a/b;
        //     System.out.println(resultado);
        // }

        // catch(ArithmeticException e){        
        //     System.out.println("Erro: divisão por zero");
        //     System.out.println(e.getMessage());
        //     e.printStackTrace();
        // }

        // System.out.println("Continuando o programa.");

        // try {
        //     int[] numeros = {1, 2, 3};

        //     System.out.println(numeros[5]);
        // }

        // catch (ArrayIndexOutOfBoundsException e){            
        //     System.out.println("Indice inválido");
        // }

        // catch (Exception e){
        //     System.out.println("Erro geral.");
        // }

        // finally {
        //     System.out.println("Operação Finalizada.");
        // }

        // int x = 10;
        // int y = 0;

        // int[] a = new int[3];
        

    }
}
