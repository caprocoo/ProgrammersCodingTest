package theory.java.source.gof.creational.builder;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer comp = new Computer.ComputerBuilder("500GB", "2GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();
    }
}
