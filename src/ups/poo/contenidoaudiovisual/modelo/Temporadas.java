package ups.poo.contenidoaudiovisual.modelo;

public class Temporadas {
        
    //VARIABLES
        
    private int numero;
    private int episodios;
        
    //CONSTRUCTOR

    public Temporadas(int numero, int episodios) {
                    this.numero = numero;
                    this.episodios = episodios;
    }
        
    //GETTERS AND SETTERS
        
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
