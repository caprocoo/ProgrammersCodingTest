package theory.java.source.gof.structural.facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade("콜라", "어벤져스");
        facade.viewMovie();

    }
}

class Remote_Control{
    public void turnOn(){
        System.out.println("TV를 켜다");
    }
    public void turnOff(){
        System.out.println("TV를 끄다");
    }
}

class Movie{
    private String name = "";

    public Movie(String name) {
        this.name = name;
    }
    public void searchMovie(){
        System.out.println(name + " 영화를 찾다");
    }
    public void changeMovie(){
        System.out.println("영화를 결제하다.");
    }
    public void playMovie(){
        System.out.println("영화 재생");
    }

}
class Beverage{
    private String name = "";

    public Beverage(String name) {
        this.name = name;
    }
    public void prepare(){
        System.out.println(name + " 음료 준비 완료");
    }
}

class Facade{
    private String beverage_name = "";
    private String movie_name = "";

    public Facade(String beverage_name, String movie_name) {
        this.beverage_name = beverage_name;
        this.movie_name = movie_name;
    }

    public void viewMovie(){
        Beverage beverage = new Beverage(beverage_name);
        Remote_Control remote_control = new Remote_Control();
        Movie movie = new Movie(movie_name);

        beverage.prepare();
        remote_control.turnOn();
        movie.searchMovie();
        movie.changeMovie();
        movie.playMovie();

    }
}
