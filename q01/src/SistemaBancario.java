import java.util.Scanner;
public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do titular:");
        String titular = scanner.nextLine();

        System.out.println("1 - Conta Corrente | 2 - Conta Poupança");
        int tipoConta = scanner.nextInt();

        Conta conta;

        if (tipoConta == 1) {
            conta = new ContaCorrente(titular);
        } else {
            conta = new ContaPoupanca(titular);
        }

        System.out.println("1 - Depositar | 2 - Sacar | 3 - Exibir Dados");
        if (tipoConta == 1) {
            System.out.println("4 - Usar Cheque Especial");
        } else {
            System.out.println("4 - Calcular Rendimento");
        }

        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Valor do depósito:");
                conta.depositar(scanner.nextDouble());
                break;
            case 2:
                System.out.println("Valor do saque:");
                conta.sacar(scanner.nextDouble());
                break;
            case 3:
                conta.exibirDados();
                break;
            case 4:
                if (tipoConta == 1) {
                    System.out.println("Valor do cheque especial:");
                    ((ContaCorrente) conta).usarChequeEspecial(scanner.nextDouble());
                } else {
                    System.out.println("Digite a taxa Selic:");
                    ((ContaPoupanca) conta).calcularRendimento(scanner.nextDouble());
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}