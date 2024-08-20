import java.util.Scanner;

public class IO {
    public static Scanner scanner(String message){
        System.out.println(message);
        return new Scanner(System.in);
    }

    public static int menu(){
        StringBuilder model = new StringBuilder();
        model.append("Digite:");
        model.append("\n");
        model.append("1 para adicionar um item bibliografico");
        model.append("\n");
        model.append("2 para mostrar todos os itens bibliografico");
        model.append("\n");
        model.append("3 para buscar um item bibliografico");
        model.append("\n");
        model.append("4 para sair");
        System.out.println(model);
        return new Scanner(System.in).nextInt();
    }
}
