import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = scanner.nextInt();

        if (num % 5 == 0){
            System.out.println("O numero é multiplo de 5");
        }
        else{
            System.out.println("O numero não é multiplo de 5");
        }
        scanner.close();
    }
}
