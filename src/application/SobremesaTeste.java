package application;

import entities.Sobremesa;

import java.util.ArrayList;
import java.util.List;

public class SobremesaTeste {

    public static void main(String[] args) {

        List<Sobremesa> list = new ArrayList<>();

        list.add(new Sobremesa("Bombom", 15.00, 123, 3, 150, "Chocolate e morango"));
        list.add(new Sobremesa("Sorvete Cubano", 25.00, 456, 1, 250, "Sorvete com Frutas"));
        list.add(new Sobremesa("Bolo Gelado", 20.00, 789, 1, 350, "Bolo Coco com Leite Coco"));

        System.out.println("Lista de Sobremesas:");
        for (Sobremesa obj : list) {
            System.out.println(obj);
        }
    }
}
