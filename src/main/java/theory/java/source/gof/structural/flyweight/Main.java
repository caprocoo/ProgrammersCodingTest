package theory.java.source.gof.structural.flyweight;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String color = "GREEN";
        for (int i = 0; i < 10; i++) {
            Tree tree = TreeFactory.getTree(color);
            tree.setX((int)(Math.random() * 100));
            tree.setY((int)(Math.random() * 100));
            tree.install();
        }
    }
}

class Tree{
    private String color;
    private int x;
    private int y;

    public Tree(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void install(){
        System.out.println("x:"+x+" y:"+y+" 위치에 "+color+"색 나무를 설치했습니다!");
    }
}

class TreeFactory{
    public static final HashMap<String, Tree> treeMap = new HashMap<>();

    public static Tree getTree(String treeColor) {
        Tree tree = treeMap.get(treeColor);

        if (tree == null) {
            tree = new Tree(treeColor);
            treeMap.put(treeColor, tree);
            System.out.println("새 객체 생성");
        }
        return tree;

    }


}



