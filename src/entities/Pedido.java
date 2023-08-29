package entities;


public class Pedido {

    private int numero;
    private String hora;
    private boolean web;


    public Pedido (int numero, String hora, boolean web) {
        this.numero = numero;
        this.hora = hora;
        this.web = web;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public boolean isWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numero=" + numero +
                ", hora=" + hora +
                ", web=" + web +
                '}';
    }
}
