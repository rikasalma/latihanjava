package Inheritance.games;

public class Main {
    public static void main(String[] args) {
        Pocong pocong = new Pocong();
        pocong.name = "pocong 1";
        pocong.hp = 100;
        pocong.attackPoin = 5;
        pocong.attack();
        System.out.println(pocong.name);

        Zombi zombi = new Zombi();
        zombi.name = "zombi";
        System.out.println(zombi.name);
        zombi.attack();

        // Pocong is enemy, Zombi is enemy, Burung is enemy
        Enemy enemy1 = new Pocong();
        Enemy enemy2 = new Zombi();
        Enemy enemy3 = new Burung();


    }
}
