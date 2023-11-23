package br.com.robervan.minhasmusicas.principal;

import br.com.robervan.minhasmusicas.modelos.Musicas;
import br.com.robervan.minhasmusicas.modelos.Podcast;
import br.com.robervan.minhasmusicas.modelos.Preferidas;

public class Principal {
    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas();
        minhaMusica.setTitulo("abelha");
        minhaMusica.setCantor("robervan");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproducao();
        }

        for (int i = 0; i <50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Alura");
        meuPodcast.setApresentador("robervan");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproducao();
            
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        Preferidas musicasPreferidas = new Preferidas();
        musicasPreferidas.inclui(meuPodcast);
        musicasPreferidas.inclui(minhaMusica);

    }
}
