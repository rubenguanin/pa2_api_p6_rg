package uce.edu.pa2.api.bodega;

public class Pedido {

    private String cliente;
    private String roducto;
    private double total;
    private String correo;

    public Pedido(String cliente, String roducto, double total, String correo) {
        this.cliente = cliente;
        this.roducto = roducto;
        this.total = total;
        this.correo = correo;
    }

    public Pedido() {
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getRoducto() {
        return roducto;
    }

    public void setRoducto(String roducto) {
        this.roducto = roducto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
