

public class MoviePlayer extends Product implements MultimediaControl { 

    MonitorType monitorType = MonitorType.LCD;
    Screen screen = new Screen();

    MoviePlayer(String name) {
        super(name);
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
                            + "\nMonitor type         :  " + monitorType
                            + "\nScreen Info \n\\---------/\n/---------\\\n" + screen.toString());                  
    }
    
}
