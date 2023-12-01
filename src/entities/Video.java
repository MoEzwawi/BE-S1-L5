package entities;

import interfaces.BrightnessAdjustable;
import interfaces.VolumeAdjustable;

public class Video extends PlayableElement implements VolumeAdjustable, BrightnessAdjustable {

    public int volume;
    public int brightness;
    public Video(String title, int duration) {

        super(title, duration);
        this.volume = 5;
        this.brightness = 5;
    }

    @Override
    public void play() {
        StringBuilder playString = new StringBuilder();
        playString.append("Video: ").append(this.title).append(" - volume:");
        playString.append(" !".repeat(this.volume));
        playString.append(" - brightness: ");
        playString.append(" *".repeat(this.brightness));
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

    public int getVolume() {
        return volume;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
