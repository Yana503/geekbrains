public class Home3 {


    public static void main(String[] args) {
        createSquareArray(5);
        retLenArr(3,5);


        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int maxMass = mass.length;
        for (int i = 0; i < maxMass; i++) {
            System.out.println(i + " - " + mass[i] + " ");

        }


        int[] array = new int[10];
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            value += 3;
            System.out.println(array[i]);
        }

        int[] mas = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxMas = mas.length;
        for (int i = 0; i < maxMass; i++) {
            if (mas[i] < 6) mas[i] = mas[i] * 2;
            System.out.print(i + "-" + mas[i] + " ");
        }

        int[] mass1 = new int[100];
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = 0 + i;
            System.out.println(i + " " + mass1[i] + " ");

        }





    }


    public static void createSquareArray ( int size){
        int[][] sqrArray = new int[size][size];

        for (int i = 0; i < size; i++){
            for (int j= 0; j < size; j++) {
                sqrArray[i][j] = (i == j || j == (size - i - 1))? 1 : (int)(Math.random()*100);

                System.out.print(sqrArray[i][j] + " ");




            }
        }
    }
    public static int []retLenArr (int len, int initialValue){
        int arr[] = new int[len];
        for (int i= 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }


}