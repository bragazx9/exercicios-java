import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = sc.nextInt();

        if (num >= 100 && num <=200 ){
            System.out.println("O numero esta entre 100 e 200");
        }
        else {
            System.out.println("o numero não esta entre 100 e 200");
        }
        sc.close();

    }
}
