package theory.java.source.gof.creational.singleton;

public class Wifi {

    private static Wifi wifi;

    public Wifi() {
    }

    public static Wifi requestWifi(){
        if(wifi == null){
            wifi = new Wifi();
        }
        return wifi;
    }
}
