package theory.java.source.gof.structural.adapter;

/**
 * packageName    : theory.java.source.gof.structural.adapter
 * fileName       : Main2
 * author         : caprocoo
 * date           : 2023-02-01
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-01        caprocoo       최초 생성
 */
public class Main2 {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if (hole.fits(roundPeg)) {
            System.out.println("잘 맞아부린다~");
        }
        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("정사각형 width 2인 못은 둥근 못 5에 맞지 않는다");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("정사각형 width 20인 못은 둥근 못 5에 맞지 않는다");
        }

    }
}

// 둥근 구멍들
class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg){
        boolean result;
        result = (this.getRadius() >= peg.getRadius());
        return result;
    }

}

// 둥근 못들
class RoundPeg{
    private double radius;

    public RoundPeg() {
    }

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

// 정사각형 못들
class SquarePeg{
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare(){
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}

// 정사각형 못들을 둥근 구멍들에 맞추는 어댑터
class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius(){
        double result;
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2)) * 2);
        return result;
    }

}

