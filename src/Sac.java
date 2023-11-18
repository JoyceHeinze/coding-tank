import java.util.Scanner;

public class Sac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o valor do empréstimo?");
        double valorEmprestimo = scan.nextDouble();

        System.out.println("Qual será a taxa de juros do empréstimo?");
        double taxaJuros = scan.nextDouble();

        System.out.println("Qual será o tempo para pagamento (em meses)?");
        int quantidadeParcelas = scan.nextInt();

        System.out.printf("Empréstimo de R$%.2f com taxa de %.2f%s de juros, durante %d meses.", valorEmprestimo, taxaJuros, "%", quantidadeParcelas);
        System.out.print("\n");

        final double AMORTIZACAO = valorEmprestimo / quantidadeParcelas;
        double saldoDevedorAtual = valorEmprestimo;
        double totalAmortizacao = 0;
        double totalJuros = 0;

        for (int i = 1; i <= quantidadeParcelas; i++) {
            double jurosMensal = saldoDevedorAtual * taxaJuros / 100;
            saldoDevedorAtual = saldoDevedorAtual - AMORTIZACAO;
            totalAmortizacao += AMORTIZACAO;
            totalJuros += jurosMensal;
            System.out.printf("Parcela %d | Juros: R$%.2f | Amortização: R$%.2f | Saldo devedor: R$%.2f", i, jurosMensal, AMORTIZACAO, saldoDevedorAtual);
            System.out.println();
        }

        System.out.printf("Total: Prestação R$%.2f, Juros R$%.2f, Amortização R$%.2f", totalAmortizacao + totalJuros, totalJuros, totalAmortizacao);
        scan.close();
    }
}
