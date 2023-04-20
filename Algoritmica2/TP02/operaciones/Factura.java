package operaciones;

import java.util.List;

public class Factura implements PorPagar {
    private String nombreProveedor, fechaDeCompra;
    private int numDeFactura;
    private List<Item> listaItems;

    public Factura(String nombreProveedor, String fechaDeCompra, int numDeFactura,
            List<Item> listaItems) {
        this.nombreProveedor = nombreProveedor;
        this.fechaDeCompra = fechaDeCompra;
        this.numDeFactura = numDeFactura;
        this.listaItems = listaItems;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public String getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(String fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

    public int getNumDeFactura() {
        return numDeFactura;
    }

    public void setNumDeFactura(int numDeFactura) {
        this.numDeFactura = numDeFactura;
    }

    public List<Item> getListaItems() {
        return listaItems;
    }

    public void setListaItems(List<Item> listaItems) {
        this.listaItems = listaItems;
    }

    public double obtenerPago() {
        double totalPago = 0;
        for (Item item : listaItems)
            totalPago += item.getPrecioUnitario() * item.getCantidadComprada();
        return totalPago;
    }
}
