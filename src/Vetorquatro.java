import java.util.Scanner;

public class Vetorquatro {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int n = 5; //tamanho do valor
        int vet[] = new int[n]; //declaração do vetor "v"
        int i; // indice ou posição
        
        // Entrada de Dados
        for (i=0; i<n; i++){
            System.out.printf("Informe o %2dº. alor de %d: ", (i + 1), n);
            vet[i] = entrada.nextInt();
        }

        entrada.close();
    }
}
