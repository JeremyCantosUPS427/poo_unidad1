package ups.poo.contenidoaudiovisual.modelo;
import java.util.Arrays;

// SUBCLASE DE CONTENIDO AUDIOVISUAL
public class Pelicula extends ContenidoAudiovisual {

    //ATRIBUTOS

    private String estudio;
    private Actor[]actores;

    //CONSTRUCTOR

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio, String plataforma, String[]opcionactores) {
        super(titulo, duracionEnMinutos, genero, plataforma);
        this.estudio = estudio;
        this.actores = Arrays.stream(opcionactores)
                .map(Actor::new)
                .toArray(Actor[]::new);
    }

    //METODOS
    
    public void mostrarActores() {

        System.out.println("ACTORES:");

        Arrays.stream(actores)
                .map(actor -> actor.getNombre())
                .forEach(System.out::println);
    }
    
    //SETTERS AND GETTERS
    
    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    //ABSTACION
    
    @Override
    public void mostrarDetalles() {
        System.out.println("CONTENIDO AUDIOVISUAL "+ getId()+ " (PELICULA)" );
        System.out.println("Detalles de la película:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio );

        mostrarActores();

        System.out.println();

    }

}
