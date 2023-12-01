package entities;

import interfaces.BrightnessAdjustable;

public class Image extends MultimediaElement implements BrightnessAdjustable {
    public int brightness;

    public Image(String title) {
        super(title);
        this.brightness = 5;
    }

    public void show() {
        StringBuilder showString = new StringBuilder();
        showString.append("Image: ").append(this.title).append(" - brightness:");
        showString.append(" *".repeat(this.brightness));
        System.out.println(showString);
    }

    @Override
    public void increaseBrighness() {
        if (this.brightness < 10) this.brightness++;
    }

    @Override
    public void decreaseBrighness() {
        if (this.brightness > 0) this.brightness--;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
