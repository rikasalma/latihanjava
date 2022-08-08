package Operator;

public class TryCatchThrow {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 0;
        try {
            c = a / b;
            System.out.println("melewati try");
        } catch (Exception e) {
            System.out.println("melewati catch");
            System.out.println("error: "+e);
        }finally {
            System.out.println("melewati finally");
        }
        System.out.println("nilai c = "+ c);

    }
}

//Try Catch di gunakan saat coding ada kemungkinan untuk eror

