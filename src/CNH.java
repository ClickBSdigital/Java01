import java.util.Scanner;

public class CNH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Passo 1: Perguntar a idade
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();
        scan.nextLine(); // Limpar o buffer
        
        // Passo 2: Perguntar se passou no teste
        System.out.print("Passou no teste? (SIM/NÃO): ");
        String teste = scan.nextLine();
        
        // Passo 3: Verificar as condições
        if (idade >= 18 && teste.equalsIgnoreCase("SIM")) {
            System.out.println("Pode dirigir!");
        } else {
            System.out.println("Não pode dirigir!");
            
            // Explicar o motivo
            if (idade < 18) {
                System.out.println("Motivo: Menor de 18 anos");
            }
            if (!teste.equalsIgnoreCase("SIM")) {
                System.out.println("Motivo: Não passou no teste");
            }
        }
        
        scan.close();
    }
}