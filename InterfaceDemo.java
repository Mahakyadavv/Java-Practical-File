public class InterfaceDemo {
    interface Printable {
        void print();
    }

    interface Scannable {
        void scan();
    }

    static class MultiFunctionMachine implements Printable, Scannable {
        @Override
        public void print() {
            System.out.println("Printing document...");
        }

        @Override
        public void scan() {
            System.out.println("Scanning document...");
        }
    }

    public static void main(String[] args) {
        MultiFunctionMachine machine = new MultiFunctionMachine();
        machine.print();
        machine.scan();
    }
}
