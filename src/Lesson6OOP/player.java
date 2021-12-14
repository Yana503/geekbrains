package Lesson6OOP;

public class player extends Actor  {


       private int countSteps =0;
       public player(String name, int healthPoint, int powerPoint, int positionX, int positionY){
           super(name, healthPoint,powerPoint, positionX,positionY);



           this.countSteps = 0;

       }

      public   void speak(){ //действия игрока
            System.out.println(" Hello! My name is " + name);
        }

      public   void moveUp (){
            positionY -=1;
            ++countSteps;
           System.out.println(" My move up. My posY " + positionY);
        }

     public void moveLeft (){
            positionX -=1;
            ++countSteps;
            System.out.println(" My move left. My posX " + positionX);
        }


       public void healSelf(int value){
            healthPoint += value;
            System.out.println(name + " heal self on " + value + " . HP now is " + healthPoint);
        }









    }


