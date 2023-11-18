import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, digite um número para a base do triângulo:");
        int base = scan.nextInt();

        int espacoVazio = 0;
        int quantidadeAsterisco = 1;

        for (int i = 1; i <= base; i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < (base - espacoVazio); j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < quantidadeAsterisco; k++) {
                    System.out.print("*");
                }
                espacoVazio++;
            }
            quantidadeAsterisco++;
            System.out.println();
        }
        scan.close();
    }
}

