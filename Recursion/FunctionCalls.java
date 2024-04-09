package Recursion;

public class FunctionCalls {
    public static void mango(){
        System.out.println("Hi, I am in mango");
    }
    public static void banana(){
        mango();
        System.out.println("Hi, I am in banana");
    }
    public static void apple(){
        banana();
        System.out.println("Hi, I am in apple");
        mango();
    }
    public static void main(String[] args) {
        System.out.println("Hi, I am in main");
        apple();
    }
}
