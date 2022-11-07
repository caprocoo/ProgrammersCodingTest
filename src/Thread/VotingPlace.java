package Thread;

public class VotingPlace {

    private String voter1;
    private String voter2;
    private boolean isEmptyPlace1;
    private boolean isEmptyPlace2;

    public VotingPlace() {
        this.isEmptyPlace1 = true;
        this.isEmptyPlace2 = true;
    }

    public synchronized void vote(String voter) throws InterruptedException {
        while((isEmptyPlace1 == false) && (isEmptyPlace2 ==false)) wait();

        if(isEmptyPlace1){
            voter1 = voter;
            isEmptyPlace1 = false;
            System.out.println("투표소 1 : " + voter1 + "님이 투표중입니다.");
        }
        else if(isEmptyPlace2){
            voter2 = voter;
            isEmptyPlace2 = false;
            System.out.println("투표소 2 : " + voter2 + "님이 투표중입니다.");
        }

    }
    public synchronized void voteDone(String voter){
        if(voter.equals(voter1)){
            voter1 = null;
            isEmptyPlace1 = true;
            System.out.println("투표소1 : "+voter+"투표 완료. 현재 비어있음");
        }
        else if(voter.equals(voter2)){
            voter2 = null;
            isEmptyPlace2 = true;
            System.out.println("투표소2 : "+voter+"투표 완료. 현재 비어있음");
        }
        notifyAll();
    }


}
