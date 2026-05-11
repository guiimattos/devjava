import java.util.Locale;
import java.util.Scanner;

public class aula104 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double vet [] = new double[5];
        double soma = 0;

        System.out.println("Digite cinco alturas de pessoas: ");

        for(int i = 0; i<5; i++){
            vet [i] = sc.nextDouble();
        }
        for(int i = 0; i<5; i++){
            soma += vet[i];
        }

        double media = 0.0;
        media = soma / 5;

        System.out.println("a media das alturas é: " + media);

        sc.close();
    }
}
