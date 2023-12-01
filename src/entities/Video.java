package entities;

import interfaces.BrightnessAdjustable;
import interfaces.VolumeAdjustable;

public class Video extends PlayableElement implements VolumeAdjustable, BrightnessAdjustable {

    public int volume = 5;
    public int brightness = 5;
    public Video(String title, int duration) {
        super(title, duration);
    }

    @Override
    public void play() {
        StringBuilder playString = new StringBuilder();
        playString.append("Video: ").append(this.title).append(" - volume:");
        playString.append(" !".repeat(Math.max(0, this.volume)));
        playString.append(" - brightness: ");
        playString.append(" *".repeat(Math.max(0, this.brightness)));
        for(int j=0;j<this.duration;j++){
            System.out.println(playString);
        }
    }

    @Override
    public void increaseBrighness() {
        if (this.brightness < 10) this.brightness++;
    }

    @Override
    public void decreaseBrighness() {
        if (this.brightness > 0) this.brightness--;
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
