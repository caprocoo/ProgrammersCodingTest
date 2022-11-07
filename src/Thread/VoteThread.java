package Thread;

public class VoteThread implements Runnable{

    VotingPlace votingPlace;
    String voter;

    public VoteThread(VotingPlace votingPlace, String voter){
        this.votingPlace = votingPlace;
        this.voter = voter;
    }

    @Override
    public void run() {
        try {
            votingPlace.vote(voter);
            Thread.sleep(3000);
            votingPlace.voteDone(voter);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
