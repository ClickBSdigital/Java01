import java.util.Scanner;

public class Vetorseis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int n = entrada.nextInt();
        int vet[] = new int[n];
        int soma = 0;
        
        // Entrada de Dados
        for (int i = 0; i < n; i++) {
            System.out.printf("Informe o %2dº. valor de %d: ", (i + 1), n);
            vet[i] = entrada.nextInt();
        }

        // Cálculo e exibição detalhada
        System.out.println("\nProcesso de soma:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d", vet[i]);
            if (i < n - 1) {
                System.out.print(" + ");
            }
            soma += vet[i];
        }
        System.out.println(" = " + soma);

        entrada.close();
    }
}