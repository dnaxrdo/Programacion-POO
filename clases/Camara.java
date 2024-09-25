package clases;

public class Camara extends Producto {

    private String marca;
    private String modelo;

    public Camara(String marca, String modelo, int numero) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Camara de la: " + marca + ", modelo: " + modelo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}

/*
Herencia: La clase Camara extiende la clase Producto, heredando sus propiedades y métodos.
Encapsulamiento: Protege los datos internos (marca y modelo) mediante atributos privados y métodos públicos.
Polimorfismo: Sobrescribe el método mostrarDetalles() de la clase Producto para proporcionar una implementación específica.
Constructores: Inicializa los atributos marca, modelo, y numero al crear una instancia.
Métodos Accesores (Getters y Setters): Controlan la obtención y modificación de los atributos marca y modelo.
*/