package increment;

class CountingThread extends Thread {
    private Increment counter;

    public CountingThread(Increment counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}