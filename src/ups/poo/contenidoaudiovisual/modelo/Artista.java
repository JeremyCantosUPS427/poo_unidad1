package ups.poo.contenidoaudiovisual.modelo;

public class Artista {

    //ATRIBUTOS
    private String Nombre;
    private String Nacionalidad;

    //CONSTRUCTOR
    public Artista(String Nombre) {
        this.Nombre = Nombre;
    }

    //GETTERS AND SETTERS

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

}
