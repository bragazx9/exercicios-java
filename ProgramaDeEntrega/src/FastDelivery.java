import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FastDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Pedido> pedidos = new HashMap<>();
        pedidos.put("153", new Pedido("153", StatusPedido.PENDENTE));
        pedidos.put("376", new Pedido("376", StatusPedido.PROCESSANDO));
        pedidos.put("260", new Pedido("260", StatusPedido.ENVIADO));
        pedidos.put("534", new Pedido("534", StatusPedido.ENTREGUE));


        System.out.print("Digite o código do pedido: ");
        String codigo = scanner.nextLine();


        Pedido pedido = pedidos.get(codigo);
        if (pedido != null) {
            System.out.println("O status do pedido " + codigo + " é: " + pedido.getStatus());
        } else {
            System.out.println("O pedido não foi encontrado.");
        }

        scanner.close();
    }
}