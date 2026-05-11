import java.util.Scanner;

public class aula10 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int vet [] = new int[5];
    int soma = 0;
    
    System.out.println("Digite cinco numeros");
    
    for(int i = 0; i<5; i++){
        vet[i] = sc.nextInt();
        soma += vet[i];
    }

    double media = soma / 5.0;
    
    System.out.println("A média dos números digitados é: " + media);

    sc.close();
    }
}
