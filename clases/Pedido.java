package clases;

import java.util.Date;

public class Pedido {

    private Cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] productos, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public void mostrarDetallesPedido() {
        System.out.println("Detalles del pedido: ");
        for (Producto producto : productos) {
            producto.mostrarDetalles();
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    public void setNumeroTarjetaCredito(int numeroTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

}

/*
Encapsulamiento: Los atributos cliente, productos, fecha y numeroTarjetaCredito son privados y se acceden mediante métodos públicos (getCliente, setCliente, getProductos, setProductos, getFecha, setFecha, getNumeroTarjetaCredito, setNumeroTarjetaCredito).
Composición: La clase Pedido incluye instancias de Cliente y Producto, lo que indica una relación de "tiene un" (has-a) entre Pedido y estas clases.
Constructores: Inicializa los atributos cliente, productos, fecha y numeroTarjetaCredito al crear una instancia.
Métodos: El método mostrarDetallesPedido() proporciona una funcionalidad específica para mostrar los detalles del pedido, incluyendo la llamada al método mostrarDetalles() de cada producto.
*/