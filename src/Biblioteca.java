import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Biblioteca {
    List<ItemBibliografico> itens;

    public Biblioteca() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemBibliografico item){
        if(item.validarCampos()){
            itens.add(item);
            System.out.println("Livro adicionado com sucesso");
        } else {
            System.out.println("Este item não foi salvo");
        }
    }

    public void listarItens(){
        System.out.println(itens);
    }

    public ItemBibliografico buscarPorCodigo(String codigo){

        for (ItemBibliografico itemBibliografico : itens)
            if (Objects.equals(itemBibliografico.getCodigo(), codigo)) {
                System.out.println(itemBibliografico);
                return itemBibliografico;
            }
        throw new RuntimeException("Item bibliografico não encontrado");
    }
}
