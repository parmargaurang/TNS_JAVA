class SharedResource {
    int data;
    boolean isProduced = false;

    public synchronized void consumeData() {
        while (!isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed = " + data);
        isProduced = false;
        notify();
    }

    public synchronized void produceData(int data) {
        while (isProduced) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Produced = " + data);
        this.data = data;
        isProduced = true;
        notify();
    }
}

class DataProducer implements Runnable {
    SharedResource resource;

    public DataProducer(SharedResource resource) {
        this.resource = resource;
        Thread t = new Thread(this, "DataProducer");
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            resource.produceData(i++);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DataConsumer implements Runnable {
    SharedResource resource;

    public DataConsumer(SharedResource resource) {
        this.resource = resource;
        Thread t = new Thread(this, "DataConsumer");
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            resource.consumeData();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        new DataProducer(resource);
        new DataConsumer(resource);
    }
}