public class vetordois {
    
    public static void main(String[] args) {
        
        int tamanho = 5;
        int[] vetor = new int[tamanho];


        vetor[0] = 21;
        vetor[1] = 28;
        vetor[2] = 38;
        vetor[3] = 31;
        vetor[4] = 41;

        for(int i=0; i<tamanho; i++){
            System.out.printf("Vetor na posição %d é %d \n",i,vetor[i]);
        }
    }
}
