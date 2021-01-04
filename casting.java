public class casting {
    public static void main(String[] args) {
        int num1 = 33;
        double var1 = num1;
        System.out.println("int to double=" + var1);// widdening

        int num2 = (int) var1;
        System.out.println("Double to int=" + num2);// Narrowing

        float var = 45;
        System.out.println("Float value=" + var);

        int var2 = (int) var;
        System.out.println("Narrowing:-Float to int=" + var2);

    }

}