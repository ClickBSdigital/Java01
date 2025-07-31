import java.util.Scanner;

public class Vetorcinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int n = entrada.nextInt();
        int vet[] = new int[n];
        
        // Entrada de Dados
        for (int i = 0; i < n; i++) {
            System.out.printf("Informe o %2dº. valor de %d: ", (i + 1), n);
            vet[i] = entrada.nextInt();
        }

        // Exibição do Vetor
        System.out.println("\nValores do vetor:");
        for (int i = 0; i < n; i++) {
            System.out.printf("vet[%d] = %d\n", i, vet[i]);
        }

        entrada.close();
    }
}