import java.util.Locale;
import java.util.Scanner;

public class aula104 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = 5;
        double[] vet = new double[numero];
        double soma = 0;

        System.out.println("Digite cinco alturas de pessoas: ");

        for(int i = 0; i < numero; i++){
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }

        double media = soma / numero;

        System.out.println("A media das alturas é: " + media);

        sc.close();
    }
}
