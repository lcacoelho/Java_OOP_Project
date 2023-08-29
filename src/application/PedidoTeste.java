package application;

import entities.Pedido;

public class PedidoTeste {

    public static void main(String[] args) {
        Pedido p1 = new Pedido (1,"23:50", true);
        Pedido p2 = new Pedido (2,"12:15", false);
        Pedido p3 = new Pedido (3,"09:25", true);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}



