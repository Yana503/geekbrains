public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Hello World");
        color();
        checkSumSign();
        printColor();
        compareNumbers();


    }
    private static void color(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign (){
        int a = 5;
        int b = -15;
        boolean c = (a + b)>0;
        if (c){
            System.out.println("Сумма положительная");
        } else{
            System.out.println("Cумма отрицательная");
        }


    }

    private static void printColor(){
        int value = 1000;
        if (value <= 0){
            System.out.println("Красный");
        } else if (0 < value && value <=100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленный");
        }

    }

    private static void compareNumbers (){
        int a = 8;
        int b = 71;
        if (a >= b){
            System.out.println(a >= b);

        } else {
            System.out.println(a < b);
        }
    }

}
