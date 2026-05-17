import java.util.Scanner;

public class Estudo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char resp;

        do{
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("A temperatura equilavente em Fahrenheit é: %.1f%n" , F);
            System.out.print("Deseja repetir s/n?");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
        if (resp == 'n') {
            System.out.println("Muito Obrigado!");
        }

        sc.close();
    }   
}

// do-while