package entities;

import exceptions.BusinessException;

public class Comida extends Produto {
    private int quantidade;
    private int gramas;
    private String marca;

    public Comida (){
        super ();
    }

    public Comida(String nome, double valor, int codigo, int quantidade, int gramas, String marca) {
        super (nome, valor, codigo);
        this.quantidade = quantidade;
        this.gramas = gramas;
        this.marca = marca;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getGramas() {
        return gramas;
    }

    public void setGramas(int gramas) {
        this.gramas = gramas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Regra do Negócio : peso não pode exceder 1 quilo
    @Override
    public int consumo() {
        validaConsumo();
        return (int) getGramas() * getQuantidade();
    }
    private void validaConsumo() {
        if (getGramas() * quantidade > 1000) {
            throw new BusinessException("O valor gramas excede o limite de 1 quilo");
        }
    }

    @Override
    public String toString() {
        return "Comida{" +
                "nome='" + getNome() + '\'' +
                ", valor=" + getValor() +
                ", codigo=" + getCodigo() +
                ", quantidade=" + quantidade +
                ", gramas=" + gramas +
                ", marca='" + marca + '\'' +
                '}';
    }
}

