import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Olga on 13.04.2017.
 */
public class Main {
    public static void main(String[] args) {

        long range =10000000000L;
        Random r = new Random();

        long[] array = new long[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i] =   (long)(r.nextDouble()*range);
        }

        MergeSorting.mergeSort(array);
        System.out.println("The min element is " + array[0]);
        System.out.println("The max element is " + array[array.length - 1]);
    }
}
