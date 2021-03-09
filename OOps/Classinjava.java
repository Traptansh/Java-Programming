public class Classinjava {
    /*
    *OOPS IS A WAY OF PROGRAMMING:- 
    1) ENCAPSULATION :
    2) INHERITANCE :
    3) POLYMORPHISM :
    4) ABSTRACTION :
    5) CLASS:
    6) OBJECTS :
    */
    String name = "puneet";
    public void fun(String Lives){
        Lives = "In srinagar";
        System.out.println(Lives);
    }
    public static void main(String[] args) {
        /*
        *Class:- Data member
        *class we have to create object of class
        *Classname Objectname = new ClassConstructor()
        */
        Classinjava o1 = new Classinjava();
        System.out.println("o1.name");
        o1.fun("Lives in Srinagar");
    }
}