import java.util.Scanner;

public class javaudemy9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String [] nome = new String[n];

        for(int i=0; i<n; i++){
            nome[i] = sc.next();
        }
        System.out.println("nomes lidos:");
        for(int i=0; i<n; i++){
            System.out.println(nome[i]);
        }

        sc.close();
    }
}
