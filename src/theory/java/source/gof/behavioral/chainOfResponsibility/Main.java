package theory.java.source.gof.behavioral.chainOfResponsibility;

import java.util.Scanner;

/**
 * packageName    : theory.java.source.gof.behavioral.chainOfResponsibility
 * fileName       : Main
 * author         : caprocoo
 * date           : 2023-02-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-02-07        caprocoo       최초 생성
 */
public class Main {
    public static void main(String[] args) {
        Withdraw100000Won withdraw100000Won = new Withdraw100000Won();
        Withdraw50000Won withdraw50000Won = new Withdraw50000Won();
        Withdraw10000Won withdraw10000Won = new Withdraw10000Won();

        withdraw100000Won.setNextChain(withdraw50000Won);
        withdraw50000Won.setNextChain(withdraw10000Won);

        while (true) {
            System.out.println("인출할 돈을 눌러주세요.");
            Scanner scanner = new Scanner(System.in);
            int money = scanner.nextInt();
            Currency currency = new Currency(money);
            withdraw100000Won.withdraw(currency);
            System.out.println("-------------------------");
        }
    }
}

class Currency{
    private int amount;

    public int getAmount() {
        return amount;
    }

    public Currency(int amount) {
        this.amount = amount;
    }
}

interface WithdrawChain{
    void setNextChain(WithdrawChain withdrawChain);
    void withdraw(Currency currency);
}

class Withdraw100000Won implements WithdrawChain {

    private WithdrawChain withdrawChain;

    @Override
    public void setNextChain(WithdrawChain withdrawChain) {
        this.withdrawChain = withdrawChain;
    }

    @Override
    public void withdraw(Currency currency) {
        if (currency.getAmount() >= 100000) {
            int num = currency.getAmount() / 100000;
            int remain = currency.getAmount() % 100000;
            System.out.println("10만원짜리 " + num + "장이 인출되었습니다.");
            if (remain != 0) {
                this.withdrawChain.withdraw(new Currency(remain));
            }
        } else {
            this.withdrawChain.withdraw(currency);
        }

    }
}

class Withdraw50000Won implements WithdrawChain {

    private WithdrawChain withdrawChain;

    @Override
    public void setNextChain(WithdrawChain withdrawChain) {
        this.withdrawChain = withdrawChain;
    }

    @Override
    public void withdraw(Currency currency) {
        if (currency.getAmount() >= 50000) {
            int num = currency.getAmount() / 50000;
            int remain = currency.getAmount() % 50000;
            System.out.println("5만원짜리 "+num+"장이 인출되었습니다. ");
            if(remain!=0){
                this.withdrawChain.withdraw(new Currency(remain));
            }
        }else{
            this.withdrawChain.withdraw(currency);
        }
    }
}

class Withdraw10000Won implements WithdrawChain {

    private WithdrawChain withdrawChain;

    @Override
    public void setNextChain(WithdrawChain withdrawChain) {
        this.withdrawChain = withdrawChain;
    }

    @Override
    public void withdraw(Currency currency) {
        if (currency.getAmount() >= 10000) {
            int num = currency.getAmount() / 10000;
            int remain = currency.getAmount() % 10000;
            System.out.println("1만원짜리 "+num+"장이 인출되었습니다. ");
            if(remain!=0){
                this.withdrawChain.withdraw(new Currency(remain));
            }
        }else{
            this.withdrawChain.withdraw(currency);
        }
    }
}