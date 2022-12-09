public class Main {
    public static void main(String[] args) {
        int [] array;
        array = new int[30];
        array[0] = 100;
        for (int i=0; i<29; i++) {
            array[(i+1)] = array[i] + 2;
        }

        //  первая задача урока массивы, часть 2

        int sumMonthly = 0;
        for (int i=0; i<array.length; i++) {
            sumMonthly = sumMonthly + array[i];
        }
        System.out.println(" "+sumMonthly);

        System.out.println("_______________________");
    }
}