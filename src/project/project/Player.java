public class Player implements MultimediaControl {

    public void play() {
        System.out.println("Playing from other player");

    }
    public void previous() {
        System.out.println("Previously on other player");
    }
    public void stop() {
        System.out.println("Stopping other player");
    }

    public void next() {
        System.out.println("Playing next song");
    }

    public static void main(String [] args) {
        Player player = new Player();
        player.play();
        player.previous();
        player.stop();
    }
}
