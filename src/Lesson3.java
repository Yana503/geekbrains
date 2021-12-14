import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        System.out.println(random.nextInt());
        System.out.println(random.nextFloat());
        System.out.println(random.nextInt(20));
        System.out.println(randomIntegerRange(-60, -30));
        System.out.println("Random password = " + randomPassword(8));

        System.out.println("Enter your nickname: ");
        String inputUserString = scanner.next();
        greetingUser(inputUserString);
        System.out.println("Enter your number: ");
        int inputUserInteger = scanner.nextInt();
        System.out.println("Result: " + myCalcsum(inputUserInteger));

        scanner.close();

        int[] arrayInt = new int[5]; // заполненный массив
        arrayInt[0] = 15;
        arrayInt[1] = 20;
        arrayInt[2] = -5;
        arrayInt[3] = 0;
        arrayInt[4] = 6;
         int tmp = arrayInt[2];
        System.out.println(tmp);

        String[] myTestArrey = new String[100]; //распечатывает 100 раз  Стринг
        for (int i =0; i < myTestArrey.length; i++){
            myTestArrey[i] = "String #" + i;
            System.out.print(myTestArrey[i] + " ");

        }


    }

    public static String randomPassword(int count){
        String tmpString = "";
        for (int i = 0; i < count; i++){
            int valueAscii = randomIntegerRange(70, 150);
            char tmpChar =(char)valueAscii;
            tmpString +=tmpChar;
        }

        return tmpString ;
    }

    public static int randomIntegerRange(int min, int max){
        int diff = max - min;
        int value = random.nextInt(diff + 1);
        return min + value;

    }

    public static void greetingUser(String name) {
        System.out.println("Hello " +  name);
    }

    public static int myCalcsum(int valueA) {
        return valueA +10;


    }
}
