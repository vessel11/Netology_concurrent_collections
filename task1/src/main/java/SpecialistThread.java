public class SpecialistThread extends Thread {

    private final Atc atc;


    public SpecialistThread(Atc atc) {
        this.atc = atc;
    }

    @Override
    public void run() {
        while (atc.getNumberOfAnsweredCalls() != Main.NUMBER_OF_CALLS) {
            try {
                String call = atc.pollCall();
                if (call != null) {
                    Thread.sleep(3000);
                    atc.setIncrNumberOfAnsweredCalls(atc.getNumberOfAnsweredCalls());
                    System.out.println(call + " done!");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}