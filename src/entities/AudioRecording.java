package entities;

import interfaces.VolumeAdjustable;

public class AudioRecording extends PlayableElement implements VolumeAdjustable {

    public int volume = 5;

    public AudioRecording(String title, int duration) {
        super(title, duration);
    }

    @Override
    public void play() {
        StringBuilder playString = new StringBuilder();
        playString.append("Recording: ").append(this.title).append(" - volume:");
        playString.append(" !".repeat(Math.max(0, this.volume)));
        for(int j=0;j<this.duration;j++){
            System.out.println(playString);
        }
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
