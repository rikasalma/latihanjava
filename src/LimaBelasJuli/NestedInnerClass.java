package LimaBelasJuli;

//public class NestedInnerClass {
    class Outer {
    //        private String nama = "Rika";
    // Simple nested inner class
    void outerMethod() {
        System.out.println("inside outerMethod");
// Inner class is local to outerMethod()
        Inner y = new Inner();
        y.innerMethod();
    }

    class Inner {
        void innerMethod() {
            System.out.println("inside innerMethod");
        }
    }
}




//            public void show() {
//                System.out.println("In a nested class method");
//                System.out.println(nama);
//            }
//        }
//    }


