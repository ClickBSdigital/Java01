import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o número real: ");
        double numReal = scanner.nextDouble();
        double resultado1 = num1 * (num2 / 2.0);
        double resultado2 = (num1 * 3) + numReal;
        double resultado3 = Math.pow(numReal, 3);
        System.out.printf("Produto do primeiro com a metade do segundo: %.2f%n", resultado1);
        System.out.printf("Soma do triplo do primeiro com o terceiro: %.2f%n", resultado2);
        System.out.printf("Terceiro número ao cubo: %.2f%n", resultado3);
        scanner.close();
    }
}