public class method { 
    public static void fun() {
        System.out.println("Function.");
    }

    public void students() {
        String student1 = "shubham";
        String student2 = "pratik";
        String student3 = "aman";
        System.out.println("students are:-" + student1 + " " + student2 + " " + student3);
    }

    public int sum() {
        int a, b;
        a = 2;
        b = 3;
        return a + b;
    }

    public char alphabet(char z) {
        return z;
    }

    public static void main(String[] args) { //takes nothing returns something
        method o1 = new method();
        fun();
        o1.students();
        int result = o1.sum();
        System.out.println("Takes nothing returns something" + result);
        char store = o1.alphabet('a');
        System.out.println(store);
    }
}