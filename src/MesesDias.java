public class MesesDias {
    public static void main(String[] args) {
        // Vetor com os nomes dos meses
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril",
            "Maio", "Junho", "Julho", "Agosto",
            "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        
        // Vetor com a quantidade de dias em cada mês
        int[] dias = {
            31, 28, 31, 30,  // Janeiro, Fevereiro, Março, Abril
            31, 30, 31, 31,   // Maio, Junho, Julho, Agosto
            30, 31, 30, 31    // Setembro, Outubro, Novembro, Dezembro
        };
        
        // Exibindo os meses e seus dias
        System.out.println("Meses do ano e quantidade de dias:");
        for (int i = 0; i < meses.length; i++) {
            System.out.printf("%-9s - %2d dias%n", meses[i], dias[i]);
        }
        
        // Exemplo adicional: encontrar um mês específico
        String mesProcurado = "Julho";
        for (int i = 0; i < meses.length; i++) {
            if (meses[i].equalsIgnoreCase(mesProcurado)) {
                System.out.printf("\n%s tem %d dias%n", mesProcurado, dias[i]);
                break;
            }
        }
    }
}