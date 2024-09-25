package clases;

public class Impresion extends Producto {

    private String color;
    private Foto[] fotos;

    public Impresion(String color, Foto[] fotos, int numero) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Impresion de color: " + color);
        for (Foto foto : fotos) {
            foto.print();
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Foto[] getFotos() {
        return fotos;
    }

    public void setFotos(Foto[] fotos) {
        this.fotos = fotos;
    }

}
/*
Herencia: La clase Impresion extiende la clase Producto, heredando sus propiedades y métodos.
Encapsulamiento: Los atributos color y fotos son privados y se acceden mediante métodos públicos (getColor, setColor, getFotos, setFotos).
Polimorfismo: Sobrescribe el método mostrarDetalles() de la clase Producto para proporcionar una implementación específica que incluye la impresión de cada foto.
Constructores: Inicializa los atributos color, fotos y numero al crear una instancia.
Métodos Accesores (Getters y Setters): Controlan la obtención y modificación de los atributos color y fotos.
*/