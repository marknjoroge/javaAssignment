public class AudioPlayer extends Product implements MultimediaControl {

    String audioPecification;
    ItemType mediaType;
    AudioPlayer(String name, String audioSpecification) {
        super(name);
        mediaType = ItemType.AU;
    }

    public void play() {
        System.out.println("Playing");
    }

    public void stop() {
        System.out.println("Stopping");
    }

    public void previous() {
        System.out.println("Previous song playing");
    }

    public void next() {
        System.out.println("Next song playing");
    }

    public void toSting() {
        System.out.println(super.toString() 
                            + "\nAudio Spec         :  " + audioPecification
                            + "\nType:              :  " + mediaType);                  
    }
}
