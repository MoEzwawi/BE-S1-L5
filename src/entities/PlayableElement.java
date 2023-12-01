package entities;

public abstract class PlayableElement extends MultimediaElement{

    protected int duration;
    protected PlayableElement(String title, int duration) {
        super(title);
        if (duration <= 0 || duration > 10){
            throw new IllegalArgumentException("Valid durations are from 1 to 10");
        } else {
            this.duration = duration;
        }
    }
    public static void info(){
        System.out.println("Playable elements can be either videos or audio recordings");
    }
    public abstract void play();

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration <= 0 || duration > 10){
            throw new IllegalArgumentException("Valid durations are from 1 to 10");
        } else {
            this.duration = duration;
        }
    }
}
