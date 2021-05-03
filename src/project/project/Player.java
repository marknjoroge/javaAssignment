public class Player implements MultimediaControl {

    public static void play() {
        System.out.println("Playing from other player");

    }
    public static void previous() {
        System.out.println("Previously on other player");
    }
    public static void stop() {
        System.out.println("Stopping other player");
    }

    public static void main(String [] args) {
        play();
        previous();
        stop();
    }
}
