package Matriz_lista;

public class Matriz {

    public static void main(String[] args) {

        int matriz[][] = new int[3][3];


        //linha 1º
        matriz[0][0] = 11;
        matriz[0][1] = 12;
        matriz[0][2] = 14;

        //linha 2º
        matriz[1][0] = 25;
        matriz[1][1] = 32;
        matriz[1][2] = 85;

        //linha 3º
        matriz[2][0] = 68;
        matriz[2][1] = 78;
        matriz[2][2] = 95;

        // System.out.println(matriz[1][0]);

        int i,j;
        for(i=0; i< matriz.length; i++){
            System.out.printf("%d linha: ", (i+1));
            for(j=0; j < matriz[i].length; j++){

                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println("\n");
        }

    }
    
}
