import java.util.Scanner;

public class javaudemy10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int M = sc.nextInt();
        int N = sc.nextInt();
        
        int [][] a = new int[M][N];

        for(int i = 0; i<M; i++){
            for(int j = 0; j<N; j++){
                a[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<M; i++){
            for(int j = 0; j<N; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
