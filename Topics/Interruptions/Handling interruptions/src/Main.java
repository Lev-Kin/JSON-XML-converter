class CounterThread extends Thread {

    @Override
    public void run() {
        long counter = 0;
        String msg = "It was interrupted";

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(msg);
        }

        while (true) {
            counter++;
            if (isInterrupted()) {
                System.out.println(msg);
                return;
            }
        }

    }
}
