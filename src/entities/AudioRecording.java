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
        for (int i=0;i<volume;i++){

        }
    }

    @Override
    public void turnUpVolume() {
        this.volume++;
    }

    @Override
    public void turnDownVolume() {
        this.volume--;
    }
}
