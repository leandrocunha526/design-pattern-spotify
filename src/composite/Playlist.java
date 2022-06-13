package composite;

import java.util.*;

public class Playlist {
    List<Music> musics = new ArrayList<>();
    public void play(){
        musics.forEach((music) -> {
            System.out.println(music.getTitle() + "-" + music.getTime());
        });
      }
    public void addMusic(Music music){
        this.musics.add(music);
    }
}
