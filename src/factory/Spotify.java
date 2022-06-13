package factory;

import composite.*;
import proxy.*;

public class Spotify {
    public static void main(String[] args){
       // https://www.youtube.com/watch?v=uPudE8nDog0
       Music m1 = new Single("The Human League - Don't You Want Me", 3.27f);
       
       Music all = new Album(m1);
       
       Factory factory = new Factory();
       Player free = factory.createPlayer("free");
       Player premium = factory.createPlayer("premium");
       Playlist p = new Playlist();
       Playlist album = new Playlist();
       
       album.addMusic(all);
       p.addMusic(m1);
       
       free.playMusic(p);
       premium.playMusic(album);
    }
}
