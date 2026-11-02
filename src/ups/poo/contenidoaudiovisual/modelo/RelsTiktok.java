package ups.poo.contenidoaudiovisual.modelo;
import java.util.ArrayList;

public class RelsTiktok extends ContenidoAudiovisual {
    //ATRIBUTOS
    private String descripción;
    private ArrayList<Influencer> listainfluencers;

    //CONSTRUCTOR
    public RelsTiktok(String titulo, int duracionEnMinutos, String genero, String descripción, String plataforma) {
        super(titulo, duracionEnMinutos, genero, plataforma);
        this.descripción = descripción;
        this.listainfluencers = new ArrayList<>();
    }

    //METODO CREAR LISTA DE INFLUENCER
    public void AgregarInfluencer(Influencer... nuevosInfluencers) {
        for (Influencer Influencer : nuevosInfluencers) {
            listainfluencers.add(Influencer);
        }
    }

    //SETTERS AND GETTERS

    public String getTematica() {
        return descripción;
    }

    public void setTematica(String tematica) {
        this.descripción = tematica;
    }

    //ABSTRACCION
    
    @Override
    public void mostrarDetalles() {
        System.out.println("CONTENIDO AUDIOVISUAL "+ getId()+ " (RELS DE TIKTOK)" );
        System.out.println("Detalles del Rels de TikTok:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Descripción: " + descripción);

        for (Influencer influencer : listainfluencers) {
            System.out.println("Influencer: " + influencer.getNombre() + " Nacionalidad: " + influencer.getNacionalidad());
        }

        System.out.println();

    }

}
