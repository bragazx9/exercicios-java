import java.util.Locale;
import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra:");
        char caractere = scanner.next().toLowerCase().charAt(0);

        if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
            System.out.println("A letra digitada é uma vogal");
        }
        else {
            System.out.println("nao é uma vogal");
        }
    }
}
