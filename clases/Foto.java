package clases;

public class Foto {

    String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public void print() {
        System.out.println("Se esta imprimiendo la foto: " + fichero);
    }

}
/*
Encapsulamiento: Aunque el atributo fichero no es privado, se utiliza un constructor para inicializarlo.
Abstracción: La clase Foto representa una foto con un atributo esencial (fichero) y un método (print) para imprimir la foto.
Constructores: Inicializa el atributo fichero al crear una instancia.
Métodos: El método print() proporciona una funcionalidad específica para la clase Foto.
*/