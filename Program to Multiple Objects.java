public class MultiObjects {
    int x = 10;

    public static void main(String[] args) {
        MultiObjects obj1 = new MultiObjects();
        MultiObjects obj2 = new MultiObjects();

        obj2.x = 50;

        System.out.println("Value in Object 1: " + obj1.x);
        System.out.println("Value in Object 2: " + obj2.x);
    }
}
