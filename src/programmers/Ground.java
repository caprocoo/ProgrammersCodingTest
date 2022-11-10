package programmers;



public class Ground {

    public static void main(String[] args) {

//        MyFunction f = new MyFunction() {
//            @Override
//            public int max(int a, int b) {
//                return a+b;
//            }
//        };
//        int value = f.max(3,5);
//        System.out.println("value = " + value);

        MyFunction f = (a,b)->a>b?a:b;
        int value = f.max(3,5);
        System.out.println("value = " + value);



    }
}



interface MyFunction{
    public abstract int max(int a, int b);
}