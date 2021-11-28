package Lesson5OOP;

public class player {
    private String name; //поля класса
    int healthPoint;
    int powerPoint;
    int positionX;
    int positionY;
    int countSteps =0;

    void speak(){ //действия игрока
        System.out.println("Hello! My name is" + name);
    }

    void moveUp (){
        positionY -=1;
        ++countSteps;
        System.out.println("My move up. My posY" + positionY);
    }

    void moveLeft (){
        positionX -=1;
        ++countSteps;
        System.out.println("My move left. My posX" + positionX);
    }

    void takeDamage(int value){
        healthPoint -= value;
        System.out.println("I take damage" + value + ". My hp now is" + healthPoint);
    }

    void healSelf(int value){
        healthPoint += value;
        System.out.println(name + "heal self on" + value + ". HP now is" + healthPoint);
    }

    //Getter-отдавать

    public String getName (){
        return name;

    }

    //Setter -записывает данные

    public void setName(String name) {
        this.name = name;


    }




}
