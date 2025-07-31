import java.util.Scanner;  // Importa a classe Scanner

public class Vetorforuser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Cria o objeto Scanner
        
        System.out.print("Digite o tamanho do vetor: ");
        int num = scanner.nextInt();  // Lê o número digitado pelo usuário
        
        int[] vet = new int[num];    // Cria o vetor com o tamanho informado

        // Preenche o vetor
        for (int i = 0; i < num; i++) {
            vet[i] = i;
        }
        
        // Mostra o vetor preenchido (opcional)
        System.out.println("\nVetor preenchido:");
        for (int i = 0; i < num; i++) {
            System.out.println("vet[" + i + "] = " + vet[i]);
            System.out.printf("Vetor na posição %d e %d \n", i,vet[i]);
        }
        
        scanner.close();  // Fecha o Scanner
    }
}