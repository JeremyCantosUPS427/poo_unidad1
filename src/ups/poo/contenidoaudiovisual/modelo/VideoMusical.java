package ups.poo.contenidoaudiovisual.modelo;
import java.util.Arrays;

public class VideoMusical extends ContenidoAudiovisual {

    //ATRIBUTOS
    private String estudio;
    private Artista[]artistas;

    //CONSTRUCTOR
    public VideoMusical(String titulo, int duracionEnMinutos, String genero, String estudio, String plataforma, String[]opcionartistas){
        super(titulo, duracionEnMinutos, genero, plataforma);
        this.estudio = estudio;
        this.artistas = Arrays.stream(opcionartistas)
                .map(Artista::new)
                .toArray(Artista[]::new);
    }

    //METODOS DE COMPOSICIÓN

    public void MostrarArtistas() {
        System.out.println("Artistas:");

        Arrays.stream(artistas)
                .map(Artista->Artista.getNombre())
                .forEach(System.out::println);
    }


    //GETTERS AND SETTER

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    //ABSTRACCIÓN

    @Override
    public void mostrarDetalles() {
        System.out.println("CONTENIDO AUDIOVISUAL "+ getId()+ " (VIDEO MUSICAL)" );
        System.out.println("Detalles del Video Musical:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);

        MostrarArtistas();

        System.out.println();

    }

}