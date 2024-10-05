import java.util.Scanner;
public class SistemaUber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Distância (km):");
        double distancia = scanner.nextDouble();

        System.out.println("Tempo de espera (min):");
        int tempoEspera = scanner.nextInt();

        System.out.println("Tarifa base:");
        double tarifaBase = scanner.nextDouble();

        System.out.println("Fator de demanda:");
        double fatorDemanda = scanner.nextDouble();

        CorridaUber corrida = new CorridaUber(distancia, tempoEspera, tarifaBase, fatorDemanda);
        corrida.exibirDetalhesCorrida();

        scanner.close();
    }
}