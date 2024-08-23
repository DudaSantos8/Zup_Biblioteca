public class AppSystem {
    public static void run(Biblioteca biblioteca){
        boolean control = true;
        while (control){
            int opcao = IO.menu();
            if (opcao == 1){
                criarItem(biblioteca);
            } else if (opcao == 2) {
                biblioteca.listarItens();
            } else if (opcao == 3) {
                String codigo = IO.scanner("Digite o codigo para buscar: ").nextLine();
                biblioteca.buscarPorCodigo(codigo);
            }else if(opcao == 4) control = false;
        }

    }

    public static void criarItem(Biblioteca biblioteca){

        String codigo = IO.scanner("Digite o código").nextLine();
        String titulo = IO.scanner("Digite o titulo").nextLine();
        int anoPublicacao = IO.scanner("Digite o ano de publicação").nextInt();

        int option = IO.scanner("Digite 1 para livro, ou 2 para periodico: ").nextInt();
        if (option == 1){
            String autor = IO.scanner("Digite o nome do autor").nextLine();
            String isbn = IO.scanner("Digite o isbn do livro").nextLine();

            Livro livroNovo = new Livro(codigo, titulo, anoPublicacao, autor, isbn);
            try {
               biblioteca.adicionarItem(livroNovo);
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }else if (option == 2){
            String periodicidade = IO.scanner("Digite a periodicidade").nextLine();
            int volume = IO.scanner("Digite o volume").nextInt();

            Periodico periodicoNovo = new Periodico(codigo, titulo, anoPublicacao, periodicidade, volume);
            try {
                biblioteca.adicionarItem(periodicoNovo);
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
