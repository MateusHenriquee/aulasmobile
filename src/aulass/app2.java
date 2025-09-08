package aulass;

public class app2 {
    
    public static void main(String[] args) {
        app livro = new app();
        
        livro.nome = "O senhor dos aneis";
        livro.descricao = "Uma obra literaria de fantasia";
        livro.isbn = "9783161484100";
        livro.preco = 39.90;
        livro.autor = "j.r.r. tolkien";
        livro.datapub = "1954";
        
        System.out.println(livro.nome);
        }
        }
