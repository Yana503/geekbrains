public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Привет мир");

        int a = 10;
        int b = 5;
        int c = a / b;
        System.out.println("c=" + c);

        float a1 = 25;
        int b1 = 4;
        System.out.println(a1 / b1);

        int a2 = 20;
        if (a2 < 10) {
            System.out.println("ok");
        } else {
            System.out.println("fail");
        }

        int b2 = 250;
        if (b2 > 20) {
            System.out.println("b2 > 20");
        } else if (b2 > 200) {
            System.out.println("b2>200");
        } else {
            System.out.println("fail");
        }

        int a3 = 150;
        int b3 = 250;
        int result;

        result = myMath(a3, b3);
        a3++;
        result = myMath(a3, b3);
        b3++;
        result = myMath(a3, b3);

        System.out.println("result =" + result);

        int cash = 1000;
        int cashback = goToShop(cash);
        System.out.println(cashback);

    }

    public static int myMath(int valueA3, int valueB3) {
        return valueA3 + valueB3 *2;
    }

    public static int goToShop(int cash) {
        System.out.println("goToShop");
        System.out.println("Buy something");
        return cash-100;

    }

}
