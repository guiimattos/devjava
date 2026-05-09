import java.util.Scanner;

public class uri1114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int senha = sc.nextInt();

        while (senha != 2007) {
            System.out.println("Senha inválida");
            sc.nextInt();
        } 
        
        System.out.println("Senha valida");

        sc.close();
    }
}