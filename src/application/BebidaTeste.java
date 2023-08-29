package application;

import entities.Bebida;

import java.util.ArrayList;
import java.util.List;

public class BebidaTeste {

    public static void main(String[] args) {

        List<Bebida> list = new ArrayList<>();

        list.add(new Bebida("agua", 2.00, 4561, 10, 350, "lindoia"));
        list.add(new Bebida("refrigerante", 2.00, 4561, 2, 500, "antartica"));
        list.add(new Bebida("cerveja", 2.00, 4561, 2, 500, "brahma"));

        System.out.println("Lista de bebidas:");

        for (Bebida obj : list) {
            System.out.println(obj);
        }
    }
}
