class Conta {
    String titular;
    double saldo = 0;

    Conta(String titular) {
        this.titular = titular;
    }

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
    }

    void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        }
    }

    void exibirDados() {
        System.out.println("Titular: " + titular + " | Saldo: R$" + saldo);
    }
}

class ContaCorrente extends Conta {
    double chequeEspecial = 1000;

    ContaCorrente(String titular) {
        super(titular);
    }

    void usarChequeEspecial(double valor) {
        if (valor <= chequeEspecial) {
            saldo += valor;
            chequeEspecial -= valor;
            System.out.println("Cheque especial usado: R$" + valor);
        } else {
            System.out.println("Cheque especial insuficiente.");
        }
    }
}

class ContaPoupanca extends Conta {

    ContaPoupanca(String titular) {
        super(titular);
    }

    void calcularRendimento(double selic) {
        double rendimento = (selic > 8.5) ? 0.005 * saldo : 0.007 * selic * saldo;
        saldo += rendimento;
        System.out.println("Rendimento aplicado. Saldo atual: R$" + saldo);
    }
}