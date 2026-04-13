public class ObjectCounterDemo {
    static class Student {
        static int count = 0;
        String name;

        Student(String name) {
            this.name = name;
            count++;
        }

        static int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        new Student("Ravi");
        new Student("Neha");
        new Student("Imran");

        System.out.println("Total objects created: " + Student.getCount());
    }
}
