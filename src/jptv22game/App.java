/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
import java.util.Random;
import java.util.Scanner;

public class App {

    public void run() {
        System.out.println("--- Game ---");
        Random random = new Random();
        boolean repeat = true;
        int attempts = 3;

        do {
            int myNumber = random.nextInt(10); // Генерируем число от 0 до 9
            System.out.println("Задумано число от 0 до 9, угадай какое: ");
            
            Scanner scanner = new Scanner(System.in);
            int userNumber;

            while (true) {
                try {
                    userNumber = Integer.parseInt(scanner.nextLine());
                    if (userNumber >= 0 && userNumber <= 9) {
                        break; // Введенное значение верное, выходим из цикла
                    } else {
                        System.out.println("Пожалуйста, введите число от 0 до 9.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Неправильный ввод. Пожалуйста, введите целое число.");
                }
            }

            if (myNumber == userNumber) {
                System.out.println("Ты выиграл! Ура!");
                repeat = false; // Завершаем игру, так как пользователь угадал число
            } else {
                System.out.println("Ты проиграл :(");
                attempts--;
                System.out.println("Попыток осталось: " + attempts);

                if (attempts <= 0) {
                    System.out.println("Ваши попытки закончились!");
                    System.out.println("Нажмите букву 'q' для выхода, любую другую клавишу чтобы продолжить");
                    String q = scanner.nextLine();

                    if (q.equals("q")) {
                        repeat = false;
                    }
                }
            }
        } while (repeat);

        System.out.println("--- End Game ---");
    }
}