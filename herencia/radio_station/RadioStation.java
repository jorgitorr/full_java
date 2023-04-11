package radio_station;

public class RadioStation {
    public static void main(String[] args) {
        PlayBackSecuence list40 = new PlayBackSecuence("List 40");
        PlayBackSecuence salsa = new PlayBackSecuence("Salsa");
        PlayBackSecuence program = new PlayBackSecuence("Program");

        list40.add(new Song("Despacito", "despacito.mp3", 10));
        list40.add(new Commercial("Movistar", "movistar.mp3", 30));
        list40.add(new Song("Black summer", "black_summer.mp3", 8));
        list40.add(new Commercial("Campofrio", "campofrio.mp3", 100));
        list40.add(new Song("De perreo", "de_perreo.mp3",7));
        list40.add(new OwnAudio("Noticia local", "noticia_local001.mp3"));

        salsa.add(new Song("Gitana","gitana.mp3",5));
        salsa.add(new Commercial("Telepizza", "telepizza.mp3",100));
        salsa.add(new OwnAudio("Noticia internacional", "noticia_internacional1001.mp3"));
        salsa.add(new Song("Amores como el nuestro", "amores_como_el_nuestro.mp3", 5));

        program.add(list40);
        program.add(new Commercial("Coca Cola", "cocal_cola.mp3", 120));
        program.add(salsa);

        System.out.println(program);
        program.play();
        program.profit();
        System.out.println("Beneficio: " + program.profit());

        AudioElement s = new Song("Mac Miller - Funeral", "funeral.mp3", 23);
        s.play();
        s = new Commercial("Kdoct - Make up", "kl_mu.mp3", 30);
        s.play();//también se puede hacer una sola clase padre para Commercial, song... que 
        //haga play y duration ya que todas esas clases hacen lo mismo y que sea el padre de todos
        //para no repetir código
        System.out.println("la duracion de la canción es: " + s.duration());
    }
}
