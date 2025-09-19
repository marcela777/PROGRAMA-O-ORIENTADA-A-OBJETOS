package musical;
import java.util.ArrayList;

import java.util.List;

class Musica{

   private String titulo;
   private String artista;
   private int duracao;

   public Musica(String tittle, String artist, int length) {
       this.titulo = tittle;
       this.artista = artist;
       this.duracao = length;
   }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getTitulo(){
       return titulo;
   }

   public String getArtista(){
        return artista;
   }

   public int getDuracao(){
        return duracao;
   }

   public String toString(){
       return ("TÍTULO: "+ this.titulo + "ARTISTA: " + this.artista + "DURAÇÃO: " + this.duracao);

   }
   Musica m1 = new Musica( "Bohemian Rhapsody", "Queen", 354);
   System.out.println(m1.toString());

class Playlist{

    String nome;
    List Musica;

    public Playlist(String name, List Music){

        this.name = nome;
        this.Music = Musica;
    }

    public void adicionarMusica(Musica novaMusica){
        musica.add(novaMusica);
    }

import java.util.ArrayList;

    public void listarMusica()
    {
        ArrayList<Musica> musica;

    }

    public void calcularDuracaoTotal(){


    }



}


}






//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        m1.toString();
    }
}