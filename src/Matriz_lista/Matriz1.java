package Matriz_lista;
import java.util.Scanner;

public class Matriz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int linhas = sc.nextInt();

        System.out.print("Digite o número de colunas: ");
        int colunas = sc.nextInt();

        int [][] matriz = new int[linhas][colunas];

        System.out.println("Digite os elementos da matriz: ");
        for (int i = 0; i< linhas; i++){
            for (int j = 0; j< colunas; j++){
                System.out.print("Elemento ["+ i +"]["+ j +"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // exibendo a matriz
        System.out.println("\nMatriz preenchida: ");
        for (int i = 0; i< linhas; i++){
            for (int j = 0; j< colunas; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
