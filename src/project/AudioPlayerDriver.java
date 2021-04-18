package project;

public class AudioPlayerDriver {

    static private String name = "dummy name";
    static private String audioType;
    static AudioPlayer audioPlayer;
    
    public static void main(String [] args) {
        audioPlayer = new AudioPlayer(name, audioType);

        audioPlayer.play();
        audioPlayer.stop();
        audioPlayer.previous();
        audioPlayer.next();
        audioPlayer.toString();
    }
}
