public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("123", "Era uma vez", 2017,"Charles Xavier", "1234567891731");
        Periodico periodico1 = new Periodico("5422", "Como as tartarugas estão", 2024,"Semanal", 2);

        try{
            biblioteca.AdicionarItem(livro1);
            biblioteca.AdicionarItem(periodico1);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try{
            biblioteca.buscarPorCodigo("5422");
            biblioteca.buscarPorCodigo("123");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
}