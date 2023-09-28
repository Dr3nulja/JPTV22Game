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
public class App {

    public void run() {
        System.out.println("--- Game ---");
        Random random = new Random();
        boolean repeat = true;
        do{
        int myNumber = random.nextInt (9-0+1)-0;
        System.out.println("Задумано число от 0 до 9, угадай какое: ");
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();scanner.nextLine();
        if(myNumber == userNumber) {
            System.out.println("Ты выйграл! Ура!");
        }else{
            System.out.println("Ты проиграл :(");
        }
        System.out.println("Нажмите буквy q для выхода, любую другую клавишу чтобы продолжить");
        String q = scanner.nextLine();
        if(q.equals("q")){
            repeat = false;
        }
        System.out.println("--- End Game ---");
    }while(repeat);
}
}