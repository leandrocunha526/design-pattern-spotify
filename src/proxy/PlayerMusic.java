package proxy;

import composite.*;

public class PlayerMusic implements Player{
    @Override
    public void playMusic(Playlist p){
        System.out.print("Playing now!");
        p.play();
    }
}
