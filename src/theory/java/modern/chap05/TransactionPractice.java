package theory.java.modern.chap05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * packageName    : theory.java.modern.chap05
 * fileName       : TransactionPractice
 * author         : caprocoo
 * date           : 2023-01-16
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-16        caprocoo       최초 생성
 */
public class TransactionPractice {
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


        // 1. 2011년에 일어난 모든 트랜잭션을 찾아 오름차순으로 정리하시오.
        Stream<Transaction> prOne = transactions.stream().filter(transaction -> transaction.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue));
//        System.out.println(prOne);

        // 2. 거래자가 근무하는 모든 도시를 중복 없이 나열하시오.
        Stream<String> prTwo = transactions.stream().map(t -> t.getTrader().getCity()).distinct();
//        System.out.println(prTwo);

        // 3. 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오.
        List<Trader> prThree = transactions.stream().map(Transaction::getTrader).filter(t -> t.getCity().equals("Cambridge")).sorted(comparing(Trader::getName)).collect(toList());
//        System.out.println(prThree);

        // 4. 모든 거래자의 이름을 알파벳순으로 정렬해서 반환하시오.
        List<String> prFour = transactions.stream().map(transaction -> transaction.getTrader().getName()).distinct().sorted(String::compareToIgnoreCase).collect(toList());
//        System.out.println(prFour);

        // 5. 밀라노에 거래자가 있는가?
        boolean prFive = transactions.stream().map(transaction -> transaction.getTrader().getCity()).anyMatch(t -> t.equals("Milan"));
//        System.out.println(prFive);

        // 6. 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오.
        Stream<Integer> prSix = transactions.stream().filter(transaction -> transaction.getTrader().getCity().equals("Cambridge")).map(Transaction::getValue);
//        System.out.println(prSix);

        // 7. 전체 트랜잭션 중 최댓값은 얼마인가?
        Optional<Integer> prSeven = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
//        System.out.println(prSeven.get());

        // 8. 전체 트랜잭션 중 최솟값은 얼마인가?
        Optional<Transaction> prEight = transactions.stream().min(comparing(Transaction::getValue));
//        System.out.println(prEight.get().getValue());

    }
}
