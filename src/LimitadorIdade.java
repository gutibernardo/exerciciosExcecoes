import java.io.FileReader;
import java.io.IOException;

public class LimitadorIdade {
            
    public int idade;

    public LimitadorIdade(int i) throws IdadeInvalidaException{
        verificarIdade(i);
    }

    public void verificarIdade(int i) throws IdadeInvalidaException{
        if(i < 18){
            throw new IdadeInvalidaException("Idade Inválida!");
        } else {
            System.out.println("Idade autorizada");
            this.idade = i;
        }
    }

    public static void lerArquivo() throws IOException{
        FileReader arquivo = 
            new FileReader("dados.txt");
    }
}
