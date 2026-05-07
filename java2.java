import java.util.Scanner;

public class java2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matriz 3x3 e variavel para guardar a soma dos valores.
        int[][] matriz = new int[3][3];
        int soma = 0;

        System.out.println("Digite os valores da matriz 3x3:");

        // Percorre cada posicao da matriz para ler e somar os valores.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
            }
        }

        System.out.println("\nMatriz:");

        // Mostra a matriz mantendo o formato de linhas e colunas.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSoma dos elementos: " + soma);
        sc.close();
    }
}
