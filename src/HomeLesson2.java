public class HomeLesson2 {
    public static void main(String[] args) {
        System.out.println(doOne(10, 8));
        doTwo(-7);
        System.out.println(doThree(-5));
        doFour("Учитель");

    }
    static boolean doOne(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;


    }

    static void doTwo(int a) {
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    static boolean doThree(int a) {
        if (a < 0) return true;
        return false;
    }

    static void doFour(String name) {
        System.out.println("Привет, " + name + "!");


    }
}