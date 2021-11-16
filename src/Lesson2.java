public class Lesson2 {


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);
        }

        int test = 0;
        while (test < 10) {
            test++;
            if (test == 5) break;
            System.out.print(test + " ");
        }

        System.out.println();

        int test1 = 0;
        do {
            test1++;
            System.out.print(test1 + " ");

        } while (test1 < 10);


        table(10, 10);
        goToShop1(1000);

        System.out.println("Result method myMath" + myMath(2, 10));
        System.out.println("Go to Shop count >" + goToShop(1000));


        System.out.println();


    }


    public static void table(int height, int width) {
        for (int y = 1; y < height; y++) {
            for (int x = 1; x < width; x++) {
                System.out.print("y * x" + "\t");
            }

            System.out.println();


        }
    }


    public static int myMath(int base, int signature) {

        int result = base;
        for (int i = 0; i < signature - 1; i++) {
            result = result * base;

        }
        return result;
    }

    public static int goToShop(int cash) {
        int price = 30;
        int count = 0;

        for (int i = 1; ; i++) {
            System.out.println("Go to Shop" + i);
            cash = cash - price;
            System.out.println("My Cach =" + cash);
            count++;
            if (cash < price) {
                System.out.println("Cash not found");
                return count;

            }


        }

    }

    public static int goToShop1(int cash) {
        int price = 30;
        int count = 0;

        while (cash > price) ;
        System.out.println("My Cach =" + cash);
        System.out.println("Go to shop count" + count);

        for (int i =1; ; i++){
            System.out.println("Go to Shop" +i);
            cash = cash-price;
            System.out.println("My Cach =" + cash);
            count++;
            if (cash < price){
                System.out.println("Cash not found");
                return count;

            }


        }





    }


}










