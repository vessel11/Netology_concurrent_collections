public class CallGeneratorThread extends Thread {



    private final Atc atc;

    public CallGeneratorThread(Atc atc) {
        this.atc = atc;
    }

    @Override
    public void run() {
        for (int i = 1; i <= Main.NUMBER_OF_CALLS; i++) {
            try {
                String currCall = "Call" + i;
                atc.addedCall(currCall);
                System.out.println(currCall + " added!");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}