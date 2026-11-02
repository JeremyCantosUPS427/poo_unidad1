package ups.poo.contenidoaudiovisual.modelo;
import java.util.ArrayList;

// SUBCLASE DE CONTENIDO AUDIOVISUAL

public class Documental extends ContenidoAudiovisual {
    private String estudio;
    private ArrayList<Investigador> investigadores;
    
    //CONSTRUCTOR

    public Documental(String titulo, int duracionEnMinutos, String genero, String estudio, String plataforma) {
        super(titulo, duracionEnMinutos, genero, plataforma);
        this.estudio = estudio;
        this.investigadores = new ArrayList<>();
    }

    //METODOS
    
    public void agregarInvestigador(Investigador... nuevosInvestigadores) {
        for (Investigador investigador : nuevosInvestigadores) {
            investigadores.add(investigador);
        }
    }

    //SETTERS AND GETTERS
    
    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    //ABSTRACCION
    
    @Override
    public void mostrarDetalles() {
        System.out.println("CONTENIDO AUDIOVISUAL "+ getId()+ " (DOCUMENTAL)" );
        System.out.println("Detalles del Documental:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);

        System.out.println("Investigadores:");
        for (Investigador investigador : investigadores) {
            System.out.println("- " + investigador.getNombre());
        }

        System.out.println();
    }


}