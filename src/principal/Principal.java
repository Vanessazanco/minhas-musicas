package principal;

import modelos.MinhasPreferidas;
import modelos.Musica;
import modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Forever");
        musica.setCantor("Kiss");
        for (int i = 0; i < 1000 ; i++) {
            musica.reproduz();
        }
        for (int i = 0; i < 500; i++) {
            musica.curte();

        }
        Podcast podcast = new Podcast();
        podcast.setTitulo("BolhaDEV");
        podcast.setApresentador("Gustavo");
        for (int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }
        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(podcast);
        minhasPreferidas.inclui(musica);
    }
}
