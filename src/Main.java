import biblioteca.Biblioteca;
import biblioteca.Carte;
import biblioteca.Video;
import biblioteca.Ziar;

public class Main {
    public static void main(String[] args) {
        Biblioteca<Carte> biblioteca = new Biblioteca<>();
        biblioteca.addStocare(new Carte());
        biblioteca.addPreluare(new Carte());

        Biblioteca<Video> biblioteca1 = new Biblioteca<>();
        biblioteca1.addStocare(new Video());
        biblioteca1.addPreluare(new Video());

        Biblioteca<Ziar> biblioteca2 = new Biblioteca<>();
        biblioteca2.addStocare(new Ziar());
        biblioteca2.addPreluare(new Ziar());


        Biblioteca biblioteca3 = new Biblioteca();
        biblioteca3.addStocare(new Carte());
        biblioteca3.addStocare(new Video());
        biblioteca3.addStocare(new Ziar());

        biblioteca3.addPreluare(new Carte());
        biblioteca3.addPreluare(new Video());
        biblioteca3.addPreluare(new Ziar());
    }
}