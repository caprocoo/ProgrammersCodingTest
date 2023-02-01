package theory.java.source.gof.structural.adapter;

/**
 * packageName    : theory.java.source.gof.structural.adapter
 * fileName       : Main
 * author         : caprocoo
 * date           : 2023-02-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-01        caprocoo       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MP3();
        player.play("file.mp3");

        player = new FormatAdapter(new MP4());
        player.play("file1.mp4");

        player = new FormatAdapter(new MKV());
        player.play("file2.mkv");

    }
}

interface MediaPlayer{
    void play(String filename);
}

interface MediaPackage{
    void playFile(String filename);
}

class MP3 implements MediaPlayer {

    @Override
    public void play(String filename) {
        System.out.println("Playing MP3 File " + filename);
    }
}

class MP4 implements MediaPackage {
    @Override
    public void playFile(String filename) {
        System.out.println("Playing MP4 File " + filename);
    }
}

class MKV implements MediaPackage {
    @Override
    public void playFile(String filename) {
        System.out.println("Playing MKV File " + filename);
    }
}

class FormatAdapter implements MediaPlayer {

    private MediaPackage mediaPackage;

    public FormatAdapter(MediaPackage mediaPackage) {
        this.mediaPackage = mediaPackage;
    }

    @Override
    public void play(String filename) {
        System.out.println("Using Adapter --> ");
        mediaPackage.playFile(filename);
    }
}

