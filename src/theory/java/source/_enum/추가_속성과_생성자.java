package theory.java.source._enum;

public class 추가_속성과_생성자 {

    public enum Color {

        RED("빨강",100), GREEN("초록",10), BLUE("파랑",30);

        private String koreName;
        private int pay;

        // 빨강, 100 순서대로 할당된다.
        private Color(String koreName, int pay){
            this.koreName = koreName;
            this.pay      = pay;
        }

        public void colorInfo(){
            System.out.println(koreName +"의 비용은 " + pay +"입니다.");
        }
    }


    public static void main(String[] args) {
        Color.BLUE.colorInfo();
    }


}
