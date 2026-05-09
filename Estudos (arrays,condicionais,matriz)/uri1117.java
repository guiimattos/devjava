import java.util.Scanner;

public class uri1117 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int notasValidas = 0;
        double soma = 0.0;

        while (notasValidas < 2) {
            double nota = sc.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("nota invalida");
            } else {
                soma += nota;
                notasValidas++;
            }
        }

        double media = soma / 2.0;
        System.out.printf("media = %.2f%n", media);

        sc.close();
    }
}
