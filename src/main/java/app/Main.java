package app;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(201) - 100;
        }
        int sumNegative = 0;
        int numberParity = 0;
        int numberNoParity = 0;
        int min = 0;
        int max = 0;
        int posMin = 0;
        int posMax = 0;
        int firstIndex = 0;
        boolean negIndex = false;

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
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstIndex = i;
                negIndex = true;
                break;
            }
        }

        double sum = 0;
        int count = 0;
        for (
                int i = firstIndex + 1;
                i < numbers.length; i++) {
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
        if (negIndex) {
            System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f", average);
        } else {
            System.out.println("Немає від'ємних чисел");
        }

    }
}