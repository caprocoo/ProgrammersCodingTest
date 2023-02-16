package theory.java.source.gof.creational.prototype;


import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : theory.java.source.gof.creational.prototype
 * fileName       : Main
 * author         : caprocoo
 * date           : 2023-01-31
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-31        caprocoo       최초 생성
 */


// 1.
// 생성자의 종류를 두 가지로 구분한다. (기본 생성자 & 매개변수가 있는 생성자)
// loadData 메서드를 통해 DB에서 데이터를 불러온 것과 같은 효과를 준다.
// clone 메서드는 객체 temp를 생성하여 기존에 emplist에 존재하던 데이터를 temp 리스트에 추가하고 두 번째 생성자에 반환한다.
class Employees implements Cloneable {

    private List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }

    public Employees(List<String> list) {
        this.empList = list;
    }

    public List<String> getEmpList() {
        return empList;
    }

    public void loadData() {
        empList.add("Ann");
        empList.add("David");
        empList.add("John");
        empList.add("Methew");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String str: this.empList) {
            temp.add(str);
        }
        return new Employees(temp);
    }
}

// 2.
// 구현
// clone 메서드를 사용하여 1회 DB접근을 통해 가져온 데이터를 다른 객체에 복사하여 사용하면 비용적인 부분에서 절감이 가능하다.
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employees emps = new Employees();
        emps.loadData();

        Employees emps1 = (Employees) emps.clone();
        Employees emps2 = (Employees) emps.clone();

        List<String> list1 = emps1.getEmpList();
        list1.add("Peter");

        List<String> list2 = emps2.getEmpList();
        list2.remove("John");

        System.out.println("emps = " + emps.getEmpList());
        System.out.println("emps1 = " + list1);
        System.out.println("emps2 = " + list2);

    }
}
