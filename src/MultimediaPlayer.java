import entities.AudioRecording;
import entities.Video;

public class MultimediaPlayer {
    public static void main(String[] args) {
        AudioRecording audio = new AudioRecording("audio",6);
        audio.turnUpVolume();
        audio.turnUpVolume();
        audio.play();
        Video video = new Video("yt",3);
        video.increaseBrighness();
        video.increaseBrighness();
        video.increaseBrighness();
        video.play();
    }
}