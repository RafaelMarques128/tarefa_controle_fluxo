import java.util.Scanner;

public class Exe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite outro número inteiro: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite outro número inteiro: ");
        double n3 = scanner.nextDouble();

        System.out.print("Digite outro número inteiro: ");
        double n4 = scanner.nextDouble();

        scanner.close();

        double media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 7) {
            System.out.println("APROVADO");
        }else if (media >=5 || media < 7) {
            System.out.println("RECUPERAÇÃO");
        }else {
            System.out.println("REPROVADO");
        }
    }
}