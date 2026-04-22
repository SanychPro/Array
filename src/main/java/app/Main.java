package app;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {-99, -98, -97, -96, -95, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 95, 96, 97, 98, 99};
        int sumNegative = 0;
        int numberParity = 0;
        int numberNoParity = 0;
        int min = 0;
        int max = 0;
        int posMin = 0;
        int posMax = 0;
        int firstIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                sumNegative += numbers[i];
            }
            if (numbers[i] % 2 == 0) {
                numberParity += 1;
            }
            if (numbers[i] % 2 != 0) {
                numberNoParity += 1;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                posMin = i;
            }
            if (numbers[i] > max) {
                max = numbers[i];
                posMax = i;
            }
            if (numbers[i] < 0) {
                firstIndex = i;
                break;
            }

        }
        double sum = 0;
        int count = 0;
        for (int i = firstIndex + 1; i < numbers.length; i++) {
            sum += numbers[i];
            count++;
        }
        double average = sum / count;

        System.out.println("Елементи масиву: " + Arrays.toString(numbers));
        System.out.println("Сума від'ємних чисел: " + sumNegative);
        System.out.println("Кількість парних чисел: " + numberParity);
        System.out.println("Кількість непарних чисел: " + numberNoParity);
        System.out.println("Найменший елемент: " + min + " (з індексом " + posMin + ")");
        System.out.println("Найбільший елемент: " + max + " (з індексом " + posMax + ")");
        System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f", average);
    }
}