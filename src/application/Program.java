package application;

import entities.*;
import exceptions.BusinessException;


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de Produtos: ");
        int n = sc.nextInt();

        Bebida[] vect = new Bebida[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("------------------------------------------------------");
            sc.nextLine();
            System.out.print("Digite o nome do produto: ");
            String nome = sc.nextLine();
            System.out.print("Digite a marca: ");
            String marca = sc.nextLine();
            System.out.print("Digite o valor do produto: ");
            double valor = sc.nextDouble();
            System.out.print("Digite o codigo do produto: ");
            int codigo = sc.nextInt();
            System.out.print("Digite a quantidade produto: ");
            int quantidade = sc.nextInt();
            System.out.print("Digite o peso em gramas do produto: ");
            int gramas = sc.nextInt();
            System.out.println();
            vect[i] = new Bebida(nome, valor, codigo, quantidade, gramas, marca);

            Bebida beb = new Bebida(nome, valor, codigo, quantidade, gramas, marca);

            try {
                beb.consumo();
                System.out.println("Peso do Produto em gramas (não pode exceder 1000): " + beb.consumo());

            } catch (BusinessException e) {
                System.out.println(e.getMessage());
            }

            System.out.println();

        }

        double sum1 = 0.0;
        {

            for (int i = 0; i < vect.length; i++) {
                sum1 += vect[i].getValor() * vect[i].getQuantidade();
            }
            double avg1 = sum1 / vect.length;

            System.out.println("======================================================");
            System.out.printf("Preço Total do Pedido = $ %.2f%n", sum1);
            System.out.printf("Preço Médio dos Produtos = $ %.2f%n", avg1);
            System.out.println("======================================================");

            System.out.println();

            sc.close();
        }
// Criando arquivo texto e gravando arquivo

        String[] lines1 = new String[] { " Como são belos os dias ..."};

        String path1 = "C:\\temp\\in.txt";

        try (BufferedWriter bw = new BufferedWriter ( new FileWriter (path1))) {
            for ( String line : lines1) {
                bw.write ( line);
                bw.newLine ();
            }
        } catch ( IOException e) {
            e .printStackTrace ();
        }

// Fazendo a leitura de um arquivo texto com layout definido pelo aluno

        String pathIn = "C:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(pathIn))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println("Arquivo TXT criado e importado:");
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }


// Gerando arquivo texto com layout diferente da entrada

        String[] lines2 = new String[] { " Como são belos os dias" + " do despertar da existência!"};

        String path = "C:\\temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter ( new FileWriter (path))) {
            for ( String line : lines2) {
                bw.write ( line);
                bw.newLine ();
            }
        } catch ( IOException e) {
            e .printStackTrace ();
        }
// Testando como o arquivo out.txt ficou reescrito

        String pathOutTeste = "C:\\temp\\out.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(pathOutTeste))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println("Arquivo TXT com novo layout:");
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}






