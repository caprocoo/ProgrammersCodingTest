package theory.java.source.gof.structural.proxy;

/**
 * packageName    : theory.java.source.gof.structural.proxy
 * fileName       : Main2
 * author         : caprocoo
 * date           : 2023-02-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-06        caprocoo       최초 생성
 */
public class Main2 {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("test1.jpg");
        Image image2 = new ProxyImage("test2.jpg");

        image1.displayImage();
        image2.displayImage();
    }
}

interface Image{
    void displayImage();
}

class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("로딩 ... " + fileName);
    }

    @Override
    public void displayImage() {
        System.out.println("보여주기... " + fileName);
    }
}

class ProxyImage implements Image {
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        if (realImage == null) {

            realImage = new RealImage(fileName);
        }

        realImage.displayImage();

    }
}
