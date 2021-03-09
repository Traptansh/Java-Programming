package codes;

public class p1_method {
    public static void main(String[] args) {
        p1_method obj = new p1_method();
        obj.func1(10,15);
        obj.func1(10,12.000);
    }
    public void func1(int x, int y){
        int z = x*y;
        System.out.println("your multiplication is =" +z);
    }
    public void func1(int x, double f){
        double p = f+x;
        System.out.println(p);
    }
}
