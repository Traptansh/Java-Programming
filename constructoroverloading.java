public class constructoroverloading {
    constructoroverloading(int a, int b) {
        int c = a + b;
        System.out.println(c);

    }

    constructoroverloading(int a, int b, String t) {
        int c = a * b;
        System.out.println(t + c);

    }

    public static void main(String[] args) {
        constructoroverloading o1 = new constructoroverloading(10, 10);
        constructoroverloading o2 = new constructoroverloading(10, 10, "Multiplication=");
    }

}