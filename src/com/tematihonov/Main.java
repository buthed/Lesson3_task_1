package com.tematihonov;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
        int end = 1;
        do {
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»");
            Scanner scanner = new Scanner(System.in);
            int regame = scanner.nextInt();
            switch (regame) {
                case 1:
                    task1();
                    break;
                case 0:
                    end = 0;
                    break;
            }
        } while (end != 0);  // убираем бесконеечный вопрос "Повторить игру?"

    }

    //сам метод
    public static void task1() {
        Random random = new Random();
        int x = random.nextInt(10);
        System.out.println("Привет, начинается игра. Загадано случайное число от 0 до 9. У тебя есть 3 попытки, чтобы угадать это число");
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите число");
            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == x) {
                System.out.println("Поздравляю вы выиграли!");
                break; }
            else if (answer != x && i == 2) System.out.println("Вы проиграли");
            else if (answer > x) System.out.println("Загаданное число меньше вашего ответа");
            else if (answer < x) System.out.println("Загаданное число больше вашего ответа");

        }
    }
}
