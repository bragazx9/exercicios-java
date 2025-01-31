import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                int num = scanner.nextInt();

                if (num % 2 == 0 ){
                    System.out.println("O numero é par");
                }
                else System.out.println("O numero é impar");
                scanner.close();

    }
}

