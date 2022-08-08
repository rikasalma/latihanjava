package Inheritance.games;

class Burung extends Enemy{
    void walk(){
        System.out.println("Burung berjalan");
    }
    void jump(){
        System.out.println("Burung loncat-loncat");
    }
    void fly(){
        System.out.println("Burung Terbang...");
    }

}
// override = interface, karena dia child
// kelebihan abstract ->
/*
Modifier
1. default (tidak ada modifier)
2. public
3. proctected
4. privare
 */