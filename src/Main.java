import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Задание 1.
        int[] sumCosts = generateRandomArray();
        int sum = 0;
        for (int i : sumCosts) {
            sum += i;
        }
        // Задание 2.
        int max = 0;
        int max_index = 0;
        int min = 0;
        int min_index = 0;
        for (int i = 0; i < sumCosts.length; i++) {
            if (sumCosts[i] > max) {
                max = sumCosts[i];
                max_index = i;
                System.out.println(max);
            } else {
                min = sumCosts[i];
                min_index = i;
                System.out.println(min);
            }
        }
        //Задание 3.
        int max1 = 0;
        int max_index1 = 0;
        double average = 0;
        for (int i = 0; i < sumCosts.length; i++) {
            if (sumCosts[i] > max1) {
                max1 = sumCosts[i];
                System.out.println(max1 % 30);
            }
        }
        // Задание 4.
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int length = 0;
        for (int element : reverseFullName) {
            length++;
            for (int i = length - 1; i >= 0; i--) {
                System.out.println(reverseFullName[i]);
            }
        }

        // Сделано ДЗ
    }
    public static int[] generateRandomArray () {
        java.util.Random random = new java.util.Random();
        int[] sumCosts = new int[30];
        for (int i = 0; i < sumCosts.length; i++) {
            sumCosts[i] = random.nextInt(100_000) + 100_000;
        }
        return sumCosts;
    }
}
