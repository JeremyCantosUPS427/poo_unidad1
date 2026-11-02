package ups.poo.contenidoaudiovisual.ejecutable;
import ups.poo.contenidoaudiovisual.modelo.*;

import java.util.Locale;

public class MainContenidoAudiovisual {
    public static void main(String[] args) {
        System.out.println("CLASIFICACIÓN DE CONTENIDO AUDIOVISUAL\n");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

        //PELICULAS - COMPOSICION
        String[] actoresAvatar = {
                "Belén Veintimilla",
                "David Cantos",
                "Juan Perez",
                "Manuel Fernandez",
        };
        Pelicula p1 = new Pelicula("Avatar", 125, "Accion", "20th Century Studios", "Netflix",actoresAvatar);
        p1.mostrarDetalles();
        contenidos[0]=p1;

        //SERIES - AGREGACION
        SerieDeTV STV1 = new SerieDeTV("Arcane", 1440, "Fantasy", "Riot Games", "Disney");
        Temporadas temporada1 = new Temporadas(1, 12);
        Temporadas temporada2 = new Temporadas(2, 12);
        STV1.agregarTemporada(temporada1,temporada2);
        STV1.mostrarDetalles();
        contenidos[1]=STV1;

        //DOCUMENTALES - AGREGACION
        Documental d1 = new Documental("Cosmos", 45, "Science", "Astronomy", "Facebook");
        Investigador investigador1 = new Investigador("Juan Pérez");
        Investigador investigador2 = new Investigador("Marianela Messi");
        d1.agregarInvestigador(investigador1, investigador2);
        d1.mostrarDetalles();
        contenidos[2]=d1;

        //VIDEOS MUSICALES - COMPOSICION
        String[] ArtistasMacarena = {
                "Antonio Romero Mongue",
                "Rafael Ruiz Perdigones",
        };
        VideoMusical VD1 = new VideoMusical("Macarena", 3, "POP", "Estudio Bola S.L.", "Spotify", ArtistasMacarena);
        VD1.mostrarDetalles();
        contenidos[3]=VD1;

        //RELS TIKTOK - AGREGACIÓN
        RelsTiktok RTT1 = new RelsTiktok("Regalo 1 Millón de Dolares", 3, "entretenimiento", "Premio a ganador de concurso", "Tiktok-Lite");
        Influencer Influencer1 = new Influencer("MrBeast", "Americana");
        RTT1.AgregarInfluencer(Influencer1);
        RTT1.mostrarDetalles();
        contenidos[4]=RTT1;
    }
}