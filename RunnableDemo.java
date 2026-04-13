public class RunnableDemo {
    static class Task implements Runnable {
        private final String taskName;

        Task(String taskName) {
            this.taskName = taskName;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(taskName + " -> " + i);
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Task("Runnable-1"));
        Thread t2 = new Thread(new Task("Runnable-2"));

        t1.start();
        t2.start();
    }
}
