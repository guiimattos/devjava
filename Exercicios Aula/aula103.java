import java.util.Scanner;

public class aula103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        String vet [] = new String [10];

        System.out.println("Digite 10 nomes de pessoas:");

        for(int i =0; i<10; i++){
            vet [i] = sc.next();
        }
        System.out.println("Os nomes inversos sao: ");
        for(int i = 9; i>=0; i--){
            System.out.println(vet [i]);
        }

        sc.close();
    }
}
