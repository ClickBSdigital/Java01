import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        
        List<String> listaNomes = new ArrayList <> ();

        listaNomes.add("Alan");
        listaNomes.add("Maria");
        listaNomes.add("Eliandro");
        listaNomes.add("Luis");
        listaNomes.add("Carlos");
        listaNomes.add("Yan"); 
        
        int tamanhoLista = listaNomes.size();
        System.out.println(listaNomes.size()); //Imprime o tamanho da lista
        listaNomes.remove(listaNomes(index:3));
        System.out.println(listaNomes.size()); //Imprime o tamanho da lista

        String nome = listaNomes.get(index:2);
        System.out.println(nome);
        listaNomes.set(index:4,element:"José do Egito")



    }
}
