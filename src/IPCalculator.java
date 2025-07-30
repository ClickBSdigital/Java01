import java.util.Scanner;

public class IPCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um endereço IP (ex: 192.168.1.10): ");
        String ip = scanner.nextLine();

        String[] partes = ip.split("\\.");
        if (partes.length != 4) {
            System.out.println("IP inválido.");
            return;
        }

        int oct1 = Integer.parseInt(partes[0]);
        int oct2 = Integer.parseInt(partes[1]);
        int oct3 = Integer.parseInt(partes[2]);
        int oct4 = Integer.parseInt(partes[3]);

        String classe = getClasse(oct1);
        String mascara = getMascaraDefault(classe);
        String[] redeInfo = getInfoRede(ip, mascara);

        System.out.println("\n== Resultado ==");
        System.out.println("IP: " + ip);
        System.out.println("Classe: " + classe);
        System.out.println("Máscara Default: " + mascara);
        System.out.println("Identificador de Rede: " + redeInfo[0]);
        System.out.println("Broadcast: " + redeInfo[1]);
        System.out.println("Primeiro IP Válido: " + redeInfo[2]);
        System.out.println("Último IP Válido: " + redeInfo[3]);
        System.out.println("Quantidade de IPs Válidos: " + redeInfo[4]);
    }

    private static String getClasse(int primeiroOcteto) {
        if (primeiroOcteto >= 1 && primeiroOcteto <= 126) return "A";
        else if (primeiroOcteto >= 128 && primeiroOcteto <= 191) return "B";
        else if (primeiroOcteto >= 192 && primeiroOcteto <= 223) return "C";
        else return "Desconhecida";
    }

    private static String getMascaraDefault(String classe) {
        switch (classe) {
            case "A": return "255.0.0.0";
            case "B": return "255.255.0.0";
            case "C": return "255.255.255.0";
            default: return "0.0.0.0";
        }
    }

    private static String[] getInfoRede(String ip, String mascara) {
        String[] ipParts = ip.split("\\.");
        String[] maskParts = mascara.split("\\.");

        int[] ipInt = new int[4];
        int[] maskInt = new int[4];
        int[] rede = new int[4];
        int[] broadcast = new int[4];

        for (int i = 0; i < 4; i++) {
            ipInt[i] = Integer.parseInt(ipParts[i]);
            maskInt[i] = Integer.parseInt(maskParts[i]);
            rede[i] = ipInt[i] & maskInt[i];
            broadcast[i] = rede[i] | (~maskInt[i] & 0xFF);
        }

        String redeStr = String.format("%d.%d.%d.%d", rede[0], rede[1], rede[2], rede[3]);
        String broadcastStr = String.format("%d.%d.%d.%d", broadcast[0], broadcast[1], broadcast[2], broadcast[3]);

        // Primeiro IP válido
        int[] first = broadcast.clone();
        first[3] = (rede[3] + 1);
        String firstIp = String.format("%d.%d.%d.%d", rede[0], rede[1], rede[2], rede[3] + 1);

        // Último IP válido
        String lastIp = String.format("%d.%d.%d.%d", broadcast[0], broadcast[1], broadcast[2], broadcast[3] - 1);

        // Quantidade de IPs válidos
        int bitsHost = 32 - getBitsMascara(maskInt);
        int totalValidIPs = (int) Math.pow(2, bitsHost) - 2;

        return new String[]{redeStr, broadcastStr, firstIp, lastIp, String.valueOf(totalValidIPs)};
    }

    private static int getBitsMascara(int[] mask) {
        int count = 0;
        for (int oct : mask) {
            for (int i = 7; i >= 0; i--) {
                if ((oct & (1 << i)) != 0) count++;
            }
        }
        return count;
    }
}
