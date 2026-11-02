package ups.poo.contenidoaudiovisual.modelo;
import java.util.ArrayList;

// SUBCLASE DE CONTENIDO AUDIOVISUAL

public class SerieDeTV extends ContenidoAudiovisual {
    private String estudio;
    private ArrayList<Temporadas> listatemporadas;

    //CONSTRUCTOR

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, String estudio, String plataforma) {
        super(titulo, duracionEnMinutos, genero, plataforma);
        this.estudio = estudio;
        this.listatemporadas = new ArrayList<>();
    }

    //METODOS

    public void agregarTemporada(Temporadas... nuevasTemporadas) {
        for (Temporadas Temporadas : nuevasTemporadas) {
            listatemporadas.add(Temporadas);
        }
    }

    //GETTERS AND SETTERS

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    //ABSTRACCION

    @Override
    public void mostrarDetalles() {
        System.out.println("CONTENIDO AUDIOVISUAL "+ getId()+ " (SERIE DE TV)" );
        System.out.println("Detalles de la Serie:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);

        System.out.println("Temporadas:");
        for (Temporadas temporadas : listatemporadas) {
            System.out.println("Temporada: " + temporadas.getNumero());
            System.out.println(" -Contiene " + temporadas.getEpisodios() + " Episodios");
        }

        System.out.println();

    }

}