import java.util.Scanner;

public class MoviePlayerDriver {

    
    public static void main (String[] args) {

        String name = "some movie";
        MoviePlayer moviePlayer = new MoviePlayer(name);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option:"
            + "\n1. Play"
            + "\n2. Previous"
            + "\n3. Stop"
            + "\n4. Next"
            + "\n5. Player Details");   

        int opt = scanner.nextInt();
        switch(opt) {
            case 1:
                moviePlayer.play();
                break;
            case 2:
                moviePlayer.previous();
                break;
            case 3:
                moviePlayer.stop();
                break;
            case 4:
                moviePlayer.next();
                break;
            case 5:
                moviePlayer.toSting();
        }
        
        scanner.close();
    }
}
