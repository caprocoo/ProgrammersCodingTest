package thread;

public class main {
    public static void main(String[] args) {
        VotingPlace votingPlace = new VotingPlace();
        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new VoteThread(votingPlace, "투표자"+i));
            thread.start();

        }


    }
}
