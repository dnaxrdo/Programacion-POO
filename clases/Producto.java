package clases;

public abstract class Producto {

    private int numero;

    public Producto(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public abstract void mostrarDetalles();
}

/*
Abstracción: La clase Producto es abstracta, lo que significa que no puede ser instanciada directamente y puede contener métodos abstractos que deben ser implementados por las subclases.
Encapsulamiento: El atributo numero es privado y se accede mediante métodos públicos (getNumero y setNumero).
Constructores: Inicializa el atributo numero al crear una instancia de una subclase concreta.
Métodos Abstractos: Define el método abstracto mostrarDetalles(), que debe ser implementado por cualquier clase que extienda Producto.
*/