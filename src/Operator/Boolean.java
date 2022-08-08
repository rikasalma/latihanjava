package Operator;

public class Boolean {
    public static boolean getTrue(){
        System.out.println("ini dari get True");
        return true;
    }
    public static boolean getFalse(){
        System.out.println("ini dari get False");
        return false;
    }

    public static void main(String[] args) {
        if (getFalse() && getTrue()){
            System.out.println("Halo");
        }
    }
}

// scanner -> meminta input dari user (harus ada import)

