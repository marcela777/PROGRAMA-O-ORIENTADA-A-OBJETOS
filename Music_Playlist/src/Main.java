import domain.Music;
import domain.Playlist;
import domain.Usuario;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Music m1 = new Music("Stricken", "Disturbed",5);
        Music m2 = new Music("Paparazzi", "Lady Gaga",5);
        Music m3 = new Music("Tempo de Pipa", "Cícero",5);
        Music m4 = new Music("De Passagem", "Cícero",5);
        Music m5 = new Music("Último Romance", "Los Hermanos",5);

        Playlist p1 = new Playlist("MPB");

        p1.adicionarMusica(m1);
        p1.adicionarMusica(m2);
        p1.adicionarMusica(m3);
        p1.adicionarMusica(m4);
        p1.adicionarMusica(m5);

        p1.listarMusicas();

        System.out.println("Duração Total: " + p1.calcularDuracaoTotal() + "s");

        List<Playlist> playlists = new ArrayList<>();
        playlists.add(p1);

        Usuario u1 = new Usuario("Marcela", playlists);

        u1.criarPlaylist("Aleatório");
        u1.adicionarMusicaPlaylist("Aleatório", new Music ("ATWA", "SOAD", 340));
        u1.adicionarMusicaPlaylist("Aleatório", new Music ("A Praia", "Cícero", 250));
        u1.listarPlaylists();


    }
}