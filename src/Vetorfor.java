public class Vetorfor {

    public static void main(String[] args) {
        
        int num = 10;
        int[] vet = new int[num];
        int i;

        for (i=0; i<num; i++) {
            vet[i] = i;
            System.out.println("vet[" + i + "] = " + vet[i]);
        }
    }
 }
    