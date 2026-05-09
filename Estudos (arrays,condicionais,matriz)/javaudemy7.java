import java.util.Locale;
import java.util.Scanner;

public class javaudemy7 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] vet = new double[N];

        for(int i=0; i<N; i++){
            vet[i] = sc.nextDouble();
        }
        System.out.print("VALORES = ");
        for(int i=0; i<N; i++){
            System.out.printf("%.1f ", vet[i]);

        }
        System.out.println();

        double soma = 0.0;
        for(int i=0; i<N; i++){
            soma = soma + vet[i];
        }
        System.out.printf("SOMA = %.2f%n" , soma);

        double media = soma / N;
        System.out.printf("MEDIA = %.2f%n" , media);

        sc.close();
    }
}
