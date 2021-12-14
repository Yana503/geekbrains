package Lesson5OOP;

public class Lesson5 {
    public static void main(String[] args) {
        System.out.println(" ==== Start====");
        player gamePlayer = new player();

      // gamePlayer.name = "Mario";
        gamePlayer.setName("Mario");
        gamePlayer.healthPoint = 100;
        gamePlayer.powerPoint = 50;
        gamePlayer.positionX = 25;
        gamePlayer.positionY = 35;
        gamePlayer.countSteps = 65;
        gamePlayer.speak();
        gamePlayer.moveUp();
        gamePlayer.moveUp();
        gamePlayer.speak();
        gamePlayer.healSelf(56);

        System.out.println("Hero name is " + gamePlayer.getName() +   ". His health is " + gamePlayer.healthPoint);



        System.out.println(" ==== End====");


    }
}
