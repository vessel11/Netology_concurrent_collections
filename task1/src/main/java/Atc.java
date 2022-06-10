import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Atc {

    private final Queue<String> pullCalls = new ConcurrentLinkedQueue<>();
    private int numberOfAnsweredCalls = 0;


    public void addedCall(String call) {
        pullCalls.offer(call);
    }

    public String pollCall() {
        return pullCalls.poll();
    }

    public int getNumberOfAnsweredCalls() {
        return numberOfAnsweredCalls;
    }

    public void setIncrNumberOfAnsweredCalls(int numberOfAnsweredCalls) {
        this.numberOfAnsweredCalls = numberOfAnsweredCalls + 1;
    }
}