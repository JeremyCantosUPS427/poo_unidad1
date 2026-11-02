package ups.poo.contenidoaudiovisual.modelo;

public abstract class ContenidoAudiovisual {

    //ATRIBUTOS
    private static int contar = 1;
    private String titulo;
    private int duracionEnMinutos;
    private String genero;
    private String plataforma;
    private int id;

    //CONSTRUCTOR
    public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero, String plataforma) {
        this.id = contar++;
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
        this.plataforma = plataforma;
    }

    //GETTERS AND SETTERRS

    public static int getContar() {
        return contar;
    }

    public static void setContar(int contar) {
        ContenidoAudiovisual.contar = contar;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void mostrarDetalles();

}