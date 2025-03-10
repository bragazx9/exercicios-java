package ForDoWhile;

import java.util.ArrayList;
import java.util.Scanner;

public class ativ31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Lista = new ArrayList<>();
        System.out.println("digite um número (para parar, digite um numero negativo.)");

        while(true){
            int num = sc.nextInt();
            if (num < 0){
                break;
            }
            Lista.add(num);
        }
        for (var recebe : Lista){
            System.out.println(recebe);
        }
        sc.close();
    }
}
