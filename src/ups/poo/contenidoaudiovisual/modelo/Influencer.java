package ups.poo.contenidoaudiovisual.modelo;

public class Influencer {

    //ATRIBUTOS
    private String nombre;
    private String nacionalidad;

    //CONSTRUCTOR
    public Influencer(String nombre, String nacionalidad){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    //SETTERS AND GETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
