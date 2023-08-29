package application;

import entities.Solicitante;

public class SolicitanteTeste {
    public static void main(String[] args) {
        Solicitante s1 = new Solicitante ("João",  "12345678972", "joao@gmail.com");
        Solicitante s2 = new Solicitante ("Maria", "78945612372", "maria@gmail.com");
        Solicitante s3 = new Solicitante ("Pedro", "74185296372", "pedro@gmail.com");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}



