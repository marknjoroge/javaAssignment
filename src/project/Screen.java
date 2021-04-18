package project;

public class Screen implements ScreenSpec{
    private String resolution;
    private int refreshRate;
    private int responseType;

    public String getResolution() {
        return resolution;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public int getResponseTime() {
        return responseType;
    }

    public String toString() {
        return ("Resolution: " + getResolution() 
        + "Refresh Rate: " + getRefreshRate() 
        + "Response Time: " + getResponseTime());
    }
    
}
