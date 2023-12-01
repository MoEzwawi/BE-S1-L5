package entities;

import interfaces.VolumeAdjustable;

public class AudioRecording extends PlayableElement implements VolumeAdjustable {

    public int volume;

    public AudioRecording(String title, int duration) {

        super(title, duration);
        this.volume = 5;
    }

    @Override
    public void play() {
        StringBuilder playString = new StringBuilder();
        playString.append("Recording: ").append(this.title).append(" - volume:");
        playString.append(" !".repeat(this.volume));
        for(int j=0;j<this.duration;j++){
            System.out.println(playString);
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void turnUpVolume() {
        if (this.volume < 10) this.volume++;
    }

    @Override
    public void turnDownVolume() {
        if(this.volume > 0) this.volume--;
    }
}
