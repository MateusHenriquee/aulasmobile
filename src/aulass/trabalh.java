package aulass;
import java.util.Scanner;
public class trabalh {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            double livrolinux;
            double livrojava;
            System.out.println("entre com o preço do livro linux");
            livrolinux = entrada.nextDouble();
            System.out.println("entre com o preço do livro java");
            livrojava = entrada.nextDouble();

            double total = livrolinux + livrojava;
            System.out.println("o preço total é " + total);

            if (livrolinux==10)
                            System.out.println("livro linux quase de graça");
                            
            if (total<=120.00)
                            System.out.println("o preço ta bom");
            
            else{
                System.out.println("Livros muito caros");
            }

            if(livrolinux>livrojava) {
                        System.out.println("livros java muito caros");
            }

            else if (livrolinux<livrojava) {
                        System.out.println("livro linux mais barato");
            }

            else{
                System.out.println("livros com o mesmo preço");
            }
        }
    
    }
}

