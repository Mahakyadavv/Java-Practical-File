public class ConstructorOverloadingDemo {
    static class Box {
        int length;
        int width;
        int height;

        Box() {
            this(1, 1, 1);
        }

        Box(int side) {
            this(side, side, side);
        }

        Box(int length, int width, int height) {
            this.length = length;
            this.width = width;
            this.height = height;
        }

        int volume() {
            return length * width * height;
        }
    }

    public static void main(String[] args) {
        Box defaultBox = new Box();
        Box cube = new Box(4);
        Box cuboid = new Box(2, 3, 5);

        System.out.println("Default box volume: " + defaultBox.volume());
        System.out.println("Cube volume: " + cube.volume());
        System.out.println("Cuboid volume: " + cuboid.volume());
    }
}
