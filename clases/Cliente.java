package clases;

public class Cliente {

    private String cedula;
    private String nombre;

    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
/*
Encapsulamiento: Protege los datos internos (cedula y nombre) mediante atributos privados y métodos públicos.
Abstracción: Representa un cliente con atributos y métodos esenciales, ocultando detalles internos.
Constructores: Inicializa los atributos al crear una instancia.
Métodos Accesores (Getters y Setters): Controlan la obtención y modificación de los atributos.
*/