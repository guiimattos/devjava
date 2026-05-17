import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu Simples");
            System.out.println("1 - Dizer ola");
            System.out.println("2 - Mostrar mensagem motivacional");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Ola!");
                    break;

                case 2:
                    System.out.println("Voce consegue!");
                    break;

                case 0:
                    System.out.println("Muito Obrigado!");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}
