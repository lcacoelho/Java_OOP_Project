package application;

import entities.Comida;

import java.util.ArrayList;
import java.util.List;

public class ComidaTeste {

    public static void main(String[] args) {

        List<Comida> list = new ArrayList<>();

        list.add(new Comida("Peixe", 100, 123, 2, 250, "Peixe com ervas"));
        list.add(new Comida("Arroz de Carreteiro", 20, 456, 1, 300, "Arroz com Carne Seca"));
        list.add(new Comida("Bife à Cavalo", 30, 789, 1, 150, "Bife de Alcatra com Ovo frito"));

        System.out.println("Lista de comidas:");

        for (Comida obj : list) {
            System.out.println(obj);
        }
    }
}