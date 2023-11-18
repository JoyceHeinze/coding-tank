import java.util.Scanner;

public class Carro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do carro: ");
        double valorDoCarro = scan.nextDouble();

        System.out.println("Deseja parcelar em quantas vezes?");
        int quantidadeParcelas = scan.nextInt();

        double valorPrestacao = valorDoCarro / quantidadeParcelas;
        double valorFinal = 0;
        if (valorPrestacao >= 1000) {
            for (int i = 1; i <= quantidadeParcelas; i++) {
                System.out.println(i + "° Parcela: R$" + valorPrestacao);
                valorFinal += valorPrestacao;
            }
            System.out.printf("O carro foi financiado em %d parcelas de R$%.2f, no valor final de R$%.2f", quantidadeParcelas, valorPrestacao, valorFinal);
        } else {
            System.out.printf("Não é possível financiar o carro, pois seriam geradas %d parcelas de R$%.2f, no valor final de R$%.2f", quantidadeParcelas, valorPrestacao, valorDoCarro);
            System.out.print("\n");
            System.out.println("Para realizar um financiamento de carro as parcelas devem ser superiores a R$1.000,00");
        }
        scan.close();
    }
}

