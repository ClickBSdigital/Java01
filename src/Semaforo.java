import java.util.Scanner;

public class Semaforo {
    public static void main(String[] args) {
        // Vetor com as cores do semáforo
        String[] cores = {"VERMELHO", "AMARELO", "VERDE"};
        
        // Vetor com os tempos de cada cor (em segundos)
        int[] tempos = {10, 5, 15};  // Vermelho: 30s, Amarelo: 5s, Verde: 45s
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("SIMULADOR DE SEMÁFORO");
        System.out.print("Quantos ciclos deseja simular? ");
        int ciclos = scanner.nextInt();
        
        // Simula o semáforo
        for (int ciclo = 1; ciclo <= ciclos; ciclo++) {
            System.out.println("\n--- CICLO " + ciclo + " ---");
            
            for (int i = 0; i < cores.length; i++) {
                System.out.println("\nCOR: " + cores[i]);
                System.out.println("Duração: " + tempos[i] + " segundos");
                
                // Contagem regressiva
                for (int segundos = tempos[i]; segundos > 0; segundos--) {
                    System.out.print(segundos + ".. ");
                    try {
                        Thread.sleep(1000); // Pausa de 1 segundo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("\nMUDANDO DE COR...");
            }
        }
        
        System.out.println("\nSIMULAÇÃO CONCLUÍDA!");
        scanner.close();
    }
}