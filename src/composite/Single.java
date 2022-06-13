package composite;

public class Single implements Music{
    public String title;
    public float time;
    
    public Single(String title, float time){
        this.title = title;
        this.time = time;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public float getTime() {
         return time;
    }
}
