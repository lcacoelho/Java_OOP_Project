package entities;


public abstract class Produto {
    private String nome;
    private double valor;
    private int codigo;

    public Produto() {
    }
    public Produto (String nome, double valor, int codigo){
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
    }

    public Produto(String nome, double valor, String nome1, double valor1, int codigo, int quantidade, int gramas, String marca) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public abstract int consumo ();



    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", codigo=" + codigo +
                '}';
    }
}
