import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = arrayRandom(30); // 30 случайных чисел.
        /**
         * Сумма расходов
         */
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        System.out.println(" Сумма трат за месяц составила " + sum + " рублей ");
        /**
         * Максимальная и минимальная сумма затрат за день.
         */
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.print(" Минимальная сумма трат за день составила " + min + " рублей ");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        /**
         * Средний расход
         */
        System.out.println("Средняя сумма трат за месяц составила " + (double) sum / array.length + " рублей");
        /**
         * Иванов
         */
        String string = "Иванов Иван Иванович";
        char[] stringToChar = string.toCharArray();
        System.out.println(Arrays.toString(stringToChar));
        for (int i = stringToChar.length - 1; i >= 0; i--) {
            System.out.print(stringToChar[i]);
        }
    }
    public static int[] arrayRandom(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(100_000) + 100_000;
        }
        return array;
    }
}




