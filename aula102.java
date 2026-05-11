import java.util.Arrays;
import java.util.Scanner;

public class aula102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vet [] = new int[10];
     
        System.out.println("Digite dez numeros:");
        
        for(int i = 0; i<10; i++){
            vet [i] = sc.nextInt();

        }

        Arrays.sort(vet);

        System.out.println("Numeros em ordem crescente");

        for(int i = 0; i<10; i++){
            System.out.println(vet [i]);
        }

        sc.close();
    }
}
