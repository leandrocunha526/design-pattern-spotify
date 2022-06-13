package composite;

public class Album implements Music{
    public Music music;
    
    public Album(Music music1){
        this.music = music1;
    }
    
    @Override
    public String getTitle() {
        return this.music.getTitle();
    }

    @Override
    public float getTime() {
        return this.music.getTime();
    }
     
}
