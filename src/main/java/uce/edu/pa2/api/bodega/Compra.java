package uce.edu.pa2.api.bodega;

public class Compra {
    private String cliente;
    private Double subtotal;
    private Double total;

    public Compra(String cliente, Double subtotal) {
        this.cliente = cliente;
        this.subtotal = subtotal;
    }

    public Compra() {

    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

}
