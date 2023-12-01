package entities;

public abstract class PlayableElement extends MultimediaElement{

    public int duration;
    public PlayableElement(String title, int duration) {
        super(title);
        if (duration <= 0 || duration > 10){
            throw new IllegalArgumentException("Valid durations are from 1 to 10");
        } else {
            this.duration = duration;
        }
    }
    public abstract void play();
}
