package Lesson6OOP;

public class Lesson6 {
    public static void main(String[] args) {
        player player= new player("Player",100,50,20,23);
        player.speak();
        player.moveUp();
        player.giveDamage();
        Enemy enemy= new Enemy("Enemy", 20,10,50,60,"Troll");
        System.out.println("enemy.getPosition() > " + enemy.getPosition());
        enemy.giveDamage();
        enemy.takeDamage(30);



}


}


