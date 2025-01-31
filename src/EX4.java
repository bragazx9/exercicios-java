import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        if (idade >= 16) {
            System.out.println("Você ja pode votar");
        }
        else {
            System.out.println("Você ainda não pode votar");
        }
        scanner.close();
    }
}
