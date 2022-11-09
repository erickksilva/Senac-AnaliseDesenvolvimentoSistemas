package ado1;


/**
 *
 * * @author Erick Nunes da Silva e Amauri Ferreira da Silva
 */
public class LivroDemoApp {

    public static void main(String[] args) {
        MetodosDeLivro.criarLivro(new Livro("Yoshihiro Togashi", "Hunter x Hunter", 350));
        MetodosDeLivro.criarLivro(new Livro("J. K. Rowling", "Harry potter", 110.90));
        MetodosDeLivro.criarLivro(new Livro("J. R. R. Tolkien", "Senhor dos Aneis", 50.40));
        MetodosDeLivro.criarLivro(new Livro("Stephen Hawking", "Breves respostas para grandes questões", 150.90));
        MetodosDeLivro.criarLivro(new Livro("Yuval Harari", "Sapiens: Uma breve história da humanidade", 120.00));
        MetodosDeLivro.criarLivro(new Livro("Ideias Para Adiar o Fim do Mundo", "Ailton Krenak", 68.90));
        MetodosDeLivro.criarLivro(new Livro("José Saramago", "Ensaio sobre a cegueira", 38.48));
        MetodosDeLivro.criarLivro(new Livro("Margaret Atwood", "Fahrenheit 451", 118.27));
        MetodosDeLivro.criarLivro(new Livro("Anne Frank", "O diario de Anne Frank", 98.13));
        MetodosDeLivro.criarLivro(new Livro("Djamila Ribeiro", "Pequeno manual antirracista", 50.90));
        MetodosDeLivro.criarLivro(new Livro("Clarisse Lispector", "A hora da estrela", 45.90));

        System.out.println("\n\t\tLista de livros\n");
        MetodosDeLivro.exibirLivros();

        System.out.println("\n\n\t\tRemovendo por Id\n");
        MetodosDeLivro.removerPorId(9);
        MetodosDeLivro.removerPorId(4);

        System.out.println("\n\n\t\tPesquisando por Titulo\n");
        MetodosDeLivro.buscarTitulo("harry potter");
        MetodosDeLivro.buscarTitulo("O diario de anne frank");
        System.out.println();

        System.out.println("\n\t\tLista de livros organizada por ordem alfabetica\n");
        MetodosDeLivro.livrosOrdemAlfabetica();
        System.out.println();

        MetodosDeLivro.removerPorId(8);
        MetodosDeLivro.removerPorId(6);
        System.out.println("\n\t\tLista de Livros");
        MetodosDeLivro.exibirLivros();
    }
}
