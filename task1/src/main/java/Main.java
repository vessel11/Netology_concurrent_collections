public class Main {


    public static final int NUMBER_OF_SPECIALIST = 3;
    public static final int NUMBER_OF_CALLS = 20;


    public static void main(String[] args) throws InterruptedException {
        Atc atc = new Atc();

        new CallGeneratorThread(atc).start();

        for (int i = 0; i < NUMBER_OF_SPECIALIST; i++) {
            new SpecialistThread(atc).start();
        }
    }
}