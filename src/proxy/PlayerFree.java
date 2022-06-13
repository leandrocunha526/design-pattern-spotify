package proxy;

import composite.*;

public class PlayerFree implements Player {
    PlayerMusic musicPlayer = new PlayerMusic();
    @Override
    public void playMusic(Playlist p) {
        System.out.println("With Spotify Premium you can listen to music without gaps and without advertisements with offline mode just for $20.90");
        musicPlayer.playMusic(p);
    }    
}
