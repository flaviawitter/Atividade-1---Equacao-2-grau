import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.println("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.println("Digite o valor de c: ");
        double c = scanner.nextDouble();

        Equacao2Grau equacao = new Equacao2Grau(a, b, c);

        double delta = equacao.calcularDelta();
        if (delta < 0) {
            System.out.println("Não existem raízes reais para essa equação.");
        } else if (delta == 0) {
            System.out.println("A equação possui uma raiz real: " + equacao.calcularX1());
        } else {
            System.out.println("A equação possui duas raízes: " + equacao.calcularX1() + " e " + equacao.calcularX2());
        }

        scanner.close();
    }
}
